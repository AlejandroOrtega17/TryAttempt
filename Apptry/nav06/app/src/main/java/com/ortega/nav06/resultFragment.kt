package com.ortega.nav06

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.ortega.nav06.databinding.FragmentHomeBinding
import com.ortega.nav06.databinding.FragmentResultBinding


class resultFragment : Fragment() {
    private val viewModel: FormViewModel by activityViewModels()
    private lateinit var binding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_result, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding.greetingTextView.text = getString(R.string.greeting_text, args.name)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner



    }

}