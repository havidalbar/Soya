package com.example.soya.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.soya.Activities.RekomendasiIkan
import com.example.soya.R

class ListRekomendasiIkanAdapter(val items : ArrayList<RekomendasiIkan>) : RecyclerView.Adapter<ViewHolderRekomendasiIkan>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderRekomendasiIkan {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderRekomendasiIkan(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolderRekomendasiIkan, position: Int) {
        val rekomendasiIkan: RekomendasiIkan = items[position]
        holder.bind(rekomendasiIkan)
    }
}

class ViewHolderRekomendasiIkan (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.rv_rekomendasi_ikan_list_item, parent, false)){
    private var ivGambarIkan : ImageView? = null
    private var tvNamaIkan: TextView? = null
    private var tvJumlahPanen: TextView? = null
    private var tvHargaJual: TextView? = null
    private var tvTingkatBerhasil: TextView? = null
    private var parentViewGroup: ViewGroup = parent

    init {
        ivGambarIkan = itemView.findViewById(R.id.iv_gambar_ikan)
        tvNamaIkan = itemView.findViewById(R.id.tv_nama_ikan)
        tvJumlahPanen = itemView.findViewById(R.id.tv_jumlah_panen)
        tvHargaJual = itemView.findViewById(R.id.tv_harga_jual)
        tvTingkatBerhasil = itemView.findViewById(R.id.tv_tingkat_berhasil)
    }

    fun bind(rekomendasiIkan: RekomendasiIkan){
        val drawableId: Int = parentViewGroup.context.getResources().getIdentifier(rekomendasiIkan.gambarIkan, "drawable", parentViewGroup.context.getPackageName())
        ivGambarIkan?.setImageDrawable(parentViewGroup.context.resources.getDrawable(drawableId))
        tvNamaIkan?.text = rekomendasiIkan.namaIkan
        tvJumlahPanen?.text = rekomendasiIkan.jumlahPanen
        tvHargaJual?.text = rekomendasiIkan.hargaJual
        tvTingkatBerhasil?.text = rekomendasiIkan.tingkatBerhasil
    }
}