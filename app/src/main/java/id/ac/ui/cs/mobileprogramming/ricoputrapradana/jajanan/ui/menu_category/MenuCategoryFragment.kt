package id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.ui.menu_category


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.R
import id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.data.db.entities.MenuCategory
import id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.databinding.FragmentMenuCategoryBinding
import id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.utils.Coroutines
import id.ac.ui.cs.mobileprogramming.ricoputrapradana.jajanan.ui.menu.MenuActivity
import kotlinx.android.synthetic.main.fragment_menu_category.*

class MenuCategoryFragment : Fragment() {

    private val categories = listOf(
        MenuCategory("FOOD"),
        MenuCategory("DRINK")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_menu_category, container, false)
    }

    /**
     * populate the views immediately when the layout has been inflated
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list_menu_category_recycler_view.apply {
            // set a LinearLayoutManager to handle Android RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)

            // set the custom adapter to the RecyclerView as well as the custom click listener
            adapter = ListMenuCategoryAdapter( categories,
                    { menuCategory: MenuCategory -> onCategoryClicked(menuCategory) })
        }
    }

    private fun onCategoryClicked(menuCategory: MenuCategory) {
        val intent = Intent(activity, MenuActivity::class.java)
        startActivity(intent)
    }
}
