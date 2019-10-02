package com.example.soya.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soya.Adapters.ListForumAdapter
import com.example.soya.Adapters.ListKolamAdapter
import com.example.soya.R
import kotlinx.android.synthetic.main.fragment_forum.*

data class PostForum(
    val namaUser: String,
    val tanggalPost: String,
    val judulPost: String,
    val jumlahBalasan: String,
    val gambarUser: String
)

class ForumFragment : Fragment(){

    val postForums: ArrayList<PostForum> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_forum, container,false)
    }

    companion object {
        fun newInstance(): ForumFragment{
            val fragment = ForumFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addPostForums()

        rv_forum_list.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListForumAdapter(postForums)
        }
    }


    fun addPostForums() {
        postForums.add(PostForum("Marjuki","02 Oktober 2019, 19:54","Bagaimana cara membersihkan kolam yang ada ikannya?","1","usermarjuki"))
        postForums.add(PostForum("Siska","02 Oktober 2019, 11:42","Bagaimana cara memilih benih yang berkualitas??","3","usersiska"))
        postForums.add(PostForum("Herman","30 September 2019, 18:39","Disini pada pake media budidaya apa?bagi alasan kalian dong","5","userherman"))
        postForums.add(PostForum("Dodi","28 September 2019, 20:14","Penyakit yang umumnya menyerah ikan pada proses budidaya","9","userdodi"))
    }
}