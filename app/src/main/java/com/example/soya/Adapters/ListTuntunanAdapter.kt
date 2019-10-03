package com.example.soya.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.soya.Fragments.TuntunanBudidaya
import com.example.soya.R

class ListTuntunanAdapter(val items : ArrayList<TuntunanBudidaya>) : RecyclerView.Adapter<ViewHolderTuntunan>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTuntunan {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderTuntunan(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolderTuntunan, position: Int) {
        val tuntunanBudidaya: TuntunanBudidaya = items[position]
        holder.bind(tuntunanBudidaya)
    }
}

class ViewHolderTuntunan (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.rv_tuntunan_budidaya_list_item, parent, false)){

    private var ivGambarTuntunan : ImageView? = null
    private var tvJudulTuntunan: TextView? = null
    private var tvDeskripsiTuntunan: TextView? = null
    private var parentViewGroup: ViewGroup = parent

    init {
        ivGambarTuntunan = itemView.findViewById(R.id.iv_gambar_tuntunan)
        tvJudulTuntunan = itemView.findViewById(R.id.tv_judul_tuntunan)
        tvDeskripsiTuntunan = itemView.findViewById(R.id.tv_deskripsi_tuntunan)
    }

    fun bind(tuntunanBudidaya: TuntunanBudidaya){
        val drawableId: Int = parentViewGroup.context.getResources().getIdentifier(tuntunanBudidaya.gambarTuntunan, "drawable", parentViewGroup.context.getPackageName())
        ivGambarTuntunan?.setImageDrawable(parentViewGroup.context.getResources().getDrawable(drawableId))
        tvJudulTuntunan?.text = tuntunanBudidaya.judulTuntunan
        tvDeskripsiTuntunan?.text = tuntunanBudidaya.deskripsiTuntunan
    }
}