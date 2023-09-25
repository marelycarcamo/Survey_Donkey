package com.marely.surveydonkey.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.desafiolatam.surveydonkey.databinding.FragmentSecondQuestionBinding
import com.marely.surveydonkey.viewmodel.MainViewModel

class SecondQuestionFragment : Fragment() {

    private var _binding: FragmentSecondQuestionBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.run {
            opcion21.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addSecondAnswer(opcion21.text.toString())
                else viewModel.removeSecondAnswer(opcion21.text.toString())
            }

            opcion22.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addSecondAnswer(opcion22.text.toString())
                else viewModel.removeSecondAnswer(opcion22.text.toString())
            }

            opcion23.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addSecondAnswer(opcion23.text.toString())
                else viewModel.removeSecondAnswer(opcion23.text.toString())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}