package com.example.animationgm.ui.fragments

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.animationgm.R
import com.example.animationgm.base.BaseFragment
import com.example.animationgm.databinding.FragmentRightBinding

class RightFragment : BaseFragment<FragmentRightBinding>(
    R.layout.fragment_right
) {
    override val binding by viewBinding(FragmentRightBinding::bind)
}