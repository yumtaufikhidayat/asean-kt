package com.taufik.asean.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.taufik.asean.data.Country
import com.taufik.asean.databinding.ItemCountryBinding
import com.taufik.asean.ui.activity.DetailActivity

class CountryAdapter : ListAdapter<Country, CountryAdapter.ViewHolder>(countryDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val binding: ItemCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(country: Country) {
            binding.apply {
                Glide.with(itemView.context)
                    .load(country.countryFlag)
                    .apply(RequestOptions().override(55, 55))
                    .into(imgItemPhoto)

                tvCountryName.text = country.countryName
                tvCountryGovSystem.text = country.countryInternationalName
                tvCountryDesc.text = country.countryDescription
                tvCountryGovernment.text = country.countryHeadGovernment
                tvCountryCapital.text = country.countryCapital
                tvCountryIndependenceDay.text = country.countryIndependenceDay
                tvCountryLanguage.text = country.countryLanguage
                tvCountryCurrency.text = country.countryCurrency
                tvCountryArea.text = country.countryLandArea

                constraintItemCountry.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_DETAIL, country)
                    }
                    it.context.startActivity(intent)
                }
            }
        }
    }

    companion object {
        val countryDiffCallback = object : DiffUtil.ItemCallback<Country>() {
            override fun areItemsTheSame(oldItem: Country, newItem: Country): Boolean = oldItem.countryName == newItem.countryName

            override fun areContentsTheSame(oldItem: Country, newItem: Country): Boolean = oldItem == newItem
        }
    }
}