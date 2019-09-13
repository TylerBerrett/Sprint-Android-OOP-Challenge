package com.example.oppsprint.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.oppsprint.R
import com.example.oppsprint.dummy.DummyContent
import com.example.oppsprint.model.Civilization
import com.example.oppsprint.model.Item
import com.example.oppsprint.model.Unit
import com.example.oppsprint.presenter.ListsOfItems
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListActivity]
 * in two-pane mode (on tablets) or a [ItemDetailActivity]
 * on handsets.
 */
class ItemDetailFragment : Fragment() {

    /**
     * The dummy content this fragment is presenting.
     */
    private var item: Item? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.
                item = ListsOfItems.hashMap[it.getString(ARG_ITEM_ID)]
                activity?.toolbar_layout?.title = item?.name
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)


        // Show the dummy content as text in a TextView.
        item?.let {

            val body = if (it is Unit){
                it.attack
            } else {
                val civilization = it as Civilization
                civilization.army_type
            }

            val text = "${item?.name}\n$body"

            rootView.item_detail.text = text
            rootView.button_toast.setOnClickListener {
                Toast.makeText(it.context, text, Toast.LENGTH_SHORT).show()
            }
        }

        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}
