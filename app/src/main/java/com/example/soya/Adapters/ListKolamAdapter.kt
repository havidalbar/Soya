package com.example.soya.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.soya.Fragments.KolamIkan
import com.example.soya.R

class ListKolamAdapter(val items : ArrayList<KolamIkan>) : RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val kolamIkan: KolamIkan = items[position]
        holder.bind(kolamIkan)
    }
}

class ViewHolder (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.rv_kolam_list_item, parent, false)) {
    private var ivNamaIkan : ImageView? = null
    private var tvNamaIkan: TextView? = null
    private var tvNamaAgen: TextView? = null
    private var tvLuas: TextView? = null
    private var tvLokasi: TextView? = null
    private var parentViewGroup: ViewGroup = parent

    init {
        ivNamaIkan = itemView.findViewById(R.id.iv_nama_ikan)
        tvNamaIkan = itemView.findViewById(R.id.tv_nama_ikan)
        tvNamaAgen = itemView.findViewById(R.id.tv_nama_agen)
        tvLuas = itemView.findViewById(R.id.tv_luas)
        tvLokasi = itemView.findViewById(R.id.tv_lokasi)
    }

    fun bind(kolamIkan: KolamIkan) {
        val drawableId: Int = parentViewGroup.context.getResources().getIdentifier(kolamIkan.gambarIkan, "drawable", parentViewGroup.context.getPackageName())
        ivNamaIkan?.setImageDrawable(parentViewGroup.context.getResources().getDrawable(drawableId))
        tvNamaIkan?.text = kolamIkan.jenisIkan
        tvNamaAgen?.text = kolamIkan.namaAgen
        tvLuas?.text = kolamIkan.luasKolam
        tvLokasi?.text = kolamIkan.lokasiKolam
    }
}