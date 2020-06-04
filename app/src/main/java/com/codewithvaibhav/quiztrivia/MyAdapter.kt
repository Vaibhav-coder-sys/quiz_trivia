package com.codewithvaibhav.quiztrivia

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(val arrayList: ArrayList<Model>,val pmUserName: String,val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(model: Model){

            itemView.titleTv.text = model.title
            itemView.imageIv.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{
            if(position == 0){

                val intent= Intent(context,QuizQuestionActivity::class.java)
                intent.putExtra("val",1)
                intent.putExtra(Constants.USER_NAME,pmUserName)

                context.startActivity(intent)

            }
            if(position == 1){

                val intent= Intent(context,QuizQuestionActivity::class.java)
                intent.putExtra("val",2)
                intent.putExtra(Constants.USER_NAME,pmUserName)
                context.startActivity(intent)
            }
            if(position == 2){

                val intent= Intent(context,QuizQuestionActivity::class.java)
                intent.putExtra("val",3)
                intent.putExtra(Constants.USER_NAME,pmUserName)
                context.startActivity(intent)
            }
            if(position == 3){

                val intent= Intent(context,QuizQuestionActivity::class.java)
                intent.putExtra("val",4)
                intent.putExtra(Constants.USER_NAME,pmUserName)
                context.startActivity(intent)
            }
            if(position == 4){

                val intent= Intent(context,QuizQuestionActivity::class.java)
                intent.putExtra("val",5)
                intent.putExtra(Constants.USER_NAME,pmUserName)
                context.startActivity(intent)
            }
        }
    }

}