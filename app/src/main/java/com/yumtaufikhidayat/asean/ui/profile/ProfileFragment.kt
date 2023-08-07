package com.yumtaufikhidayat.asean.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.yumtaufikhidayat.asean.R
import com.yumtaufikhidayat.asean.databinding.FragmentProfileBinding
import com.yumtaufikhidayat.asean.utils.Utils.appVersion
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<ProfileViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleToolbar()
        setProfile()
    }

    private fun handleToolbar() {
        binding.toolbarProfile.imgBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun setProfile() {
        binding.apply {
            lifecycleScope.launch {
                viewModel.getProfile().collect { profile ->
                    imgProfile.setImageDrawable(
                        ContextCompat.getDrawable(
                            requireContext(),
                            R.drawable.pp_taufik
                        )
                    )
                    tvProfileName.text = profile.profileName
                    tvProfileJob.text = profile.profileJob
                    tvProfileDesc.text = profile.profileDesc
                    tvProfileEmail.text = profile.profileEmail
                    tvProfileOffice.text = profile.profileOffice
                    tvProfileAppVersion.appVersion(requireContext())
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}