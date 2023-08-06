package com.yumtaufikhidayat.asean.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.yumtaufikhidayat.asean.databinding.FragmentDetailBinding
import com.yumtaufikhidayat.asean.model.Country
import com.yumtaufikhidayat.asean.utils.Utils.loadImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private var country: Country? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        handleToolbar()
        getBundleData()
        setDetailData()
    }

    private fun handleToolbar() {
        binding.toolbarDetail.imgBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun getBundleData() {
        country = arguments?.getParcelable(EXTRA_DETAIL)
    }

    private fun setDetailData() {
        binding.apply {
            imgCountryFlag.loadImage(country?.countryFlag.orEmpty())
            tvCountryName.text = country?.countryName.orEmpty()
            tvCountryIntlName.text = country?.countryInternationalName.orEmpty()
            tvCountryDesc.text = country?.countryDescription.orEmpty()
            tvCountryCapital.text = country?.countryCapital.orEmpty()
            tvCountryHeadGov.text = country?.countryHeadGovernment.orEmpty()
            tvCountryIndependenceDay.text = country?.countryIndependenceDay.orEmpty()
            tvCountryLanguage.text = country?.countryLanguage.orEmpty()
            tvCountryCurrency.text = country?.countryCurrency.orEmpty()
            tvCountryLandArea.text = country?.countryLandArea.orEmpty()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val EXTRA_DETAIL = "com.yumtaufikhidayat.asean.ui.detail.EXTRA_DETAIL"
    }
}