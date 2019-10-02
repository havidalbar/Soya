package com.example.soya.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.soya.Fragments.PostForum
import com.example.soya.R

class ListForumAdapter(val items : ArrayList<PostForum>) : RecyclerView.Adapter<ViewHolderForum>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderForum {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderForum(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolderForum, position: Int) {
        val postForum: PostForum = items[position]
        holder.bind(postForum)
    }

}

class ViewHolderForum (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.rv_forum_list_item, parent, false)){
    private var ivGambarUSer : ImageView? = null
    private var tvNamaUser: TextView? = null
    private var tvTanggalPost: TextView? = null
    private var tvJudulPost: TextView? = null
    private var tvJumlahBalasan: TextView? = null
    private var parentViewGroup: ViewGroup = parent

    init {
        ivGambarUSer = itemView.findViewById(R.id.civ_gambar_user_post)
        tvNamaUser = itemView.findViewById(R.id.tv_nama_user_post)
        tvTanggalPost = itemView.findViewById(R.id.tv_tanggal_post)
        tvJudulPost = itemView.findViewById(R.id.tv_judul_post)
        tvJumlahBalasan = itemView.findViewById(R.id.tv_jumlah_balasan_post)
    }

    fun bind(postForum: PostForum){
        val drawableId: Int = parentViewGroup.context.getResources().getIdentifier(postForum.gambarUser, "drawable", parentViewGroup.context.getPackageName())
        ivGambarUSer?.setImageDrawable(parentViewGroup.context.getResources().getDrawable(drawableId))
        tvNamaUser?.text = postForum.namaUser
        tvTanggalPost?.text = postForum.tanggalPost
        tvJudulPost?.text = postForum.judulPost
        tvJumlahBalasan?.text = postForum.jumlahBalasan
    }
}