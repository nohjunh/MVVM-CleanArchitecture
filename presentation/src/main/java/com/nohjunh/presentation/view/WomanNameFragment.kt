package com.nohjunh.presentation.view

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.nohjunh.presentation.R
import com.nohjunh.presentation.databinding.FragmentWomanNameBinding
import com.nohjunh.presentation.util.ToastUtil


class WomanNameFragment : Fragment() {

    private var _binding : FragmentWomanNameBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentWomanNameBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextBtn.setOnClickListener {
            if(TextUtils.isEmpty(binding.womanET.text.toString())) {
                ToastUtil.shortShowToast(requireContext(), "이름을 입력해 주세요.")
            }else {
                Navigation.findNavController(view).navigate(R.id.action_womanNameFragment_to_manNameFragment)
            }
        }

    }
}