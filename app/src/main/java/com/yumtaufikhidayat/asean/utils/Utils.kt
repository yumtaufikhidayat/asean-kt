package com.yumtaufikhidayat.asean.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.yumtaufikhidayat.asean.R

object Utils {
    fun ImageView.loadImage(url: String?) {
        Glide.with(this.context)
            .load(url)
            .placeholder(R.color.purple_700)
            .apply(RequestOptions().override(55, 55))
            .into(this)
    }
}