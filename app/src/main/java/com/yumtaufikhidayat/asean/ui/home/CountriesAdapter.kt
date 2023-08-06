package com.yumtaufikhidayat.asean.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.yumtaufikhidayat.asean.utils.Utils.loadImage
import com.yumtaufikhidayat.asean.databinding.ItemCountryBinding
import com.yumtaufikhidayat.asean.model.Country

class CountriesAdapter(
    private val onItemClickListener: (Country) -> Unit
): ListAdapter<Country, CountriesAdapter.ViewHolder>(COUNTRY_DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCountryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val binding: ItemCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Country) {
            binding.apply {
                imgItemPhoto.loadImage(data.countryFlag)
                tvCountryName.text = data.countryName
                tvCountryDesc.text = data.countryDescription

                constraintItemCountry.setOnClickListener {
                    onItemClickListener(data)
                }
            }
        }
    }

    companion object {
        val COUNTRY_DIFF_CALLBACK = object : DiffUtil.ItemCallback<Country>() {
            override fun areItemsTheSame(oldItem: Country, newItem: Country): Boolean {
                return oldItem.countryId == newItem.countryId
            }

            override fun areContentsTheSame(oldItem: Country, newItem: Country): Boolean {
                return oldItem == newItem
            }
        }
    }
}