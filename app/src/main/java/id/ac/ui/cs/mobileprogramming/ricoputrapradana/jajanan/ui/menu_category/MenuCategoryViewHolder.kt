package id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.ui.menu_category

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.R
import id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.data.db.entities.MenuCategory

class MenuCategoryViewHolder(inflater: LayoutInflater, parent: ViewGroup)
    : RecyclerView.ViewHolder(inflater.inflate(R.layout.menu_category_list_item, parent, false)) {

    private var menuNameTextView: TextView? = null

    init {
        menuNameTextView = itemView.findViewById(R.id.item_name)
    }

    fun bind(menu: MenuCategory, clickListener: (MenuCategory) -> Unit) {
        menuNameTextView?.text = menu.category
        itemView.setOnClickListener { clickListener(menu) }
    }
}