package com.example.animationgm.ui.fragments

import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.animationgm.R
import com.example.animationgm.base.BaseFragment
import com.example.animationgm.databinding.FragmentFrontBinding

class FrontFragment : BaseFragment<FragmentFrontBinding>(
    R.layout.fragment_front
) {
    override val binding by viewBinding(FragmentFrontBinding::bind)

    override fun setupListeners() {
        binding.leftBtn.setOnClickListener {
            findNavController().navigate(R.id.action_frontFragment_to_leftFragment)
        }
        binding.rightBtn.setOnClickListener {
            findNavController().navigate(R.id.action_frontFragment_to_rightFragment)
        }
    }
}