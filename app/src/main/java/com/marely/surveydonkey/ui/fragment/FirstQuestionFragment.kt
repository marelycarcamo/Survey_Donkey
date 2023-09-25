package com.marely.surveydonkey.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.desafiolatam.surveydonkey.databinding.FragmentFirstQuestionBinding
import com.marely.surveydonkey.viewmodel.MainViewModel

class FirstQuestionFragment : Fragment() {

    private var _binding: FragmentFirstQuestionBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.run {
            opcion11.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addFirstAnswer(opcion11.text.toString())
                else viewModel.removeFirstAnswer(opcion11.text.toString())
            }

            opcion12.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addFirstAnswer(opcion12.text.toString())
                else viewModel.removeFirstAnswer(opcion12.text.toString())
            }

            opcion13.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addFirstAnswer(opcion13.text.toString())
                else viewModel.removeFirstAnswer(opcion13.text.toString())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
