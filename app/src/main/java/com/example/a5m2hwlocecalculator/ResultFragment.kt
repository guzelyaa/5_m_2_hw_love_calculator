package com.example.a5m2hwlocecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.a5m2hwlocecalculator.databinding.FragmentResultBinding
class ResultFragment : Fragment() {

    lateinit var binding: FragmentResultBinding
    private lateinit var navArgs: ResultFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            navArgs = ResultFragmentArgs.fromBundle(it)
        }
        binding.tvYou.text = navArgs.fname
        binding.tvMe.text = navArgs.sname
        binding.tvPercentage.text = navArgs.percentage
        binding.tvResult.text = navArgs.result

        binding.btnTryAgain.setOnClickListener {
            findNavController().navigate(ResultFragmentDirections.actionResultFragmentToNameFragment())
        }
    }


}