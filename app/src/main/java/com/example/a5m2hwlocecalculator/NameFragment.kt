package com.example.a5m2hwlocecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.a5m2hwlocecalculator.databinding.FragmentNameBinding
import com.google.android.material.snackbar.Snackbar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class NameFragment : Fragment() {

    private lateinit var binding: FragmentNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNameBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCalculate.setOnClickListener {
            getRequest()
        }
    }

    private fun getRequest(){
        App.api.getPercentage(binding.edSname.text.toString(), binding.edFname.text.toString())
            .enqueue(
                object : Callback<CalculateModel>{
                    override fun onResponse(call: Call<CalculateModel>, response: Response<CalculateModel>
                    ) {
                        findNavController().navigate(NameFragmentDirections.actionNameFragmentToResultFragment(response.body()?.firstName.toString(),
                            response.body()?.secondName.toString(),response.body()?.percentage.toString(), response.body()?.result.toString()))
                    }

                    override fun onFailure(call: Call<CalculateModel>, t: Throwable) {

                    }

                }
            )
    }
}
