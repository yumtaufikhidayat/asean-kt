package com.yumtaufikhidayat.asean.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.yumtaufikhidayat.asean.R
import com.yumtaufikhidayat.asean.databinding.FragmentHomeBinding
import com.yumtaufikhidayat.asean.model.Country
import com.yumtaufikhidayat.asean.ui.detail.DetailFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val countriesAdapter by lazy { CountriesAdapter {
        navigateToDetail(it)
    }}

    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
        getAllCountries()
    }

    private fun initAdapter() {
        binding.rvMain.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = countriesAdapter
        }
    }

    private fun getAllCountries() {
        lifecycleScope.launch {
            viewModel.getAllCountries().collect {
                countriesAdapter.submitList(it)
            }
        }
    }

    private fun navigateToDetail(country: Country) {
        val bundle = Bundle().apply {
            putParcelable(DetailFragment.EXTRA_DETAIL, country)
        }
        findNavController().navigate(R.id.detailFragment, bundle)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}