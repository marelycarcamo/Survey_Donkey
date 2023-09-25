package com.marely.surveydonkey.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.desafiolatam.surveydonkey.databinding.FragmentThirdQuestionBinding
import com.marely.surveydonkey.viewmodel.MainViewModel


class ThirdQuestionFragment : Fragment() {

    private var binding: FragmentThirdQuestionBinding? = null

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdQuestionBinding.inflate(inflater,container,false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.run {
            opcion31.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addThirdAnswer(opcion31.text.toString())
                else viewModel.removeThirdAnswer(opcion31?.text.toString())
            }

            opcion32.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addThirdAnswer(opcion32.text.toString())
                else viewModel.removeThirdAnswer(opcion32?.text.toString())
            }

            opcion33.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addThirdAnswer(opcion33.text.toString())
                else viewModel.removeThirdAnswer(opcion33?.text.toString())
            }

            opcion34.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addThirdAnswer(opcion34.text.toString())
                else viewModel.removeThirdAnswer(opcion34?.text.toString())
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }
}




