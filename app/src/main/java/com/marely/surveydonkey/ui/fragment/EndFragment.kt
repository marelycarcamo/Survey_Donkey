
package com.marely.surveydonkey.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.desafiolatam.surveydonkey.databinding.FragmentEndBinding
import com.marely.surveydonkey.viewmodel.MainViewModel

class EndFragment : Fragment() {

    private var _binding: FragmentEndBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()






    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEndBinding.inflate(inflater, container, false)
        return binding.root

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvFirstAnswer.text = viewModel.getFirstResult()
        binding.tvSecondAnswer.text = viewModel.getSecondResult()
        binding.tvThirdAnswer.text = viewModel.getThirdResult()
        binding.txEmail.text = viewModel.getEmail()
        binding.txSugerencia.text = viewModel.getSugerencias()
    }

    override fun onResume() {
        super.onResume()
        binding.tvFirstAnswer.text = viewModel.getFirstResult()
        binding.tvSecondAnswer.text = viewModel.getSecondResult()
        binding.tvThirdAnswer.text = viewModel.getThirdResult()
        binding.txEmail.text = viewModel.getEmail()
        binding.txSugerencia.text = viewModel.getSugerencias()


        fun onPause() {
            super.onPause()
            binding.tvFirstAnswer.text = viewModel.getFirstResult()
            binding.tvSecondAnswer.text = viewModel.getSecondResult()
            binding.tvThirdAnswer.text = viewModel.getThirdResult()
            binding.txEmail.text = viewModel.getEmail()
            binding.txSugerencia.text = viewModel.getSugerencias()
        }
    }
}