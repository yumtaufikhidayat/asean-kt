package com.taufik.asean.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.taufik.asean.data.Country
import com.taufik.asean.databinding.ItemCountryBinding

class CountryAdapter(private val listCountry: ArrayList<Country>): RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCountry[position])
    }

    override fun getItemCount(): Int = listCountry.size

    inner class ViewHolder(private val binding: ItemCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(country: Country) {
            binding.apply {
                Glide.with(itemView.context)
                    .load(country.countryFlag)
                    .apply(RequestOptions().override(55, 55))
                    .into(imgItemPhoto)

                tvCountryName.text = country.countryName
                tvCountryDesc.text = country.countryDescription
                tvCountryGovernment.text = country.countryHeadGovernment
                tvCountryCapital.text = country.countryCapital
                tvCountryIndependenceDay.text = country.countryIndependenceDay
                tvCountryLanguage.text = country.countryLanguage
                tvCountryCurrency.text = country.countryCurrency
                tvCountryArea.text = country.countryArea
            }
        }
    }
}