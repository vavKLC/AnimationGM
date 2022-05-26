package com.example.animationgm.ui.fragments

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.animationgm.R
import com.example.animationgm.base.BaseFragment
import com.example.animationgm.databinding.FragmentLeftBinding

class LeftFragment : BaseFragment<FragmentLeftBinding>(
    R.layout.fragment_left
) {
    override val binding by viewBinding(FragmentLeftBinding::bind)
}