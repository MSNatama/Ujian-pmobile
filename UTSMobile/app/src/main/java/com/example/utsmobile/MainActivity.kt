package com.example.utsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.adapter.ItemAdapter
import com.example.utsmobile.data.DataSource
import com.example.utsmobile.databinding.ActivityMainBinding
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var isLinearLayoutManager = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView
        val adapter = ItemAdapter()
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : ItemAdapter.OnItemClickListener{

            override fun onItemClick(postition: Int) {
                super.onItemClick(postition)
                val data = DataSource.dataNBA
                val intent = Intent(this@MainActivity, DetailActivity::class.java)

                intent.putExtra("position", postition)
                intent.putExtra("data", data[postition] as Serializable)
                startActivity(intent)

            }
        })
        recyclerView.setHasFixedSize(true)
    }

    private fun chooseLayout() {
        if (isLinearLayoutManager) {
            recyclerView.layoutManager = LinearLayoutManager(this)
        } else {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        }
        val adapter = ItemAdapter()
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : ItemAdapter.OnItemClickListener{

            override fun onItemClick(postition: Int) {
                super.onItemClick(postition)
                val data = DataSource.dataNBA
                val intent = Intent(this@MainActivity, DetailActivity::class.java)

                intent.putExtra("position", postition)
                intent.putExtra("data", data[postition] as Serializable)
                startActivity(intent)
            }
        })
    }


    private fun setIcon(menuItem: MenuItem?) {
        if (menuItem == null)
            return

        menuItem.icon =
            if (isLinearLayoutManager)
                ContextCompat.getDrawable(this, R.drawable.ic_grid_layout)
            else ContextCompat.getDrawable(this, R.drawable.ic_list_layout)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_layout, menu)
        val layoutButton = menu?.findItem(R.id.action_switch_layout)
        setIcon(layoutButton)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch_layout -> {
                isLinearLayoutManager = !isLinearLayoutManager
                chooseLayout()
                setIcon(item)
                return true
            }else -> super.onOptionsItemSelected(item)
        }
    }
}
