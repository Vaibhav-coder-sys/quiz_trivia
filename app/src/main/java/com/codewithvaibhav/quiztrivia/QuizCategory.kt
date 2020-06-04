package com.codewithvaibhav.quiztrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_quiz_category.*

class QuizCategory : AppCompatActivity() {

    private var pmUserName: String = "hi"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_category)

        pmUserName = intent.getStringExtra(Constants.USER_NAME)

        val intent = Intent(this,QuizQuestionActivity::class.java)
        intent.putExtra(Constants.USER_NAME,pmUserName)


        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Brands",R.drawable.brand))
        arrayList.add(Model("Science and Technology",R.drawable.science))
        arrayList.add(Model("Places",R.drawable.places))
        arrayList.add(Model("Cricket",R.drawable.cricket))
        arrayList.add(Model("Food and Drinks",R.drawable.food))
        arrayList.add(Model("Cricket",R.drawable.cricket))

        val myAdapter = MyAdapter(arrayList,pmUserName,this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
        recyclerView.startLayoutAnimation()
    }
}
