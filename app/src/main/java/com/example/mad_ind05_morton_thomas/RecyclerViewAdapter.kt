package com.example.mad_ind05_morton_thomas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_ind05_morton_thomas.databinding.RvRowBinding
import layout.State
class RecyclerViewAdapter(val statesCollection: List<State>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    //Create a listener
    public lateinit var listener : OnItemClickListener

    //Create an interface for item click listener
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    //Set the listener variable defined above
    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener

    }
    inner class MyViewHolder(val binding: RvRowBinding, listener: OnItemClickListener) : RecyclerView.ViewHolder(binding.root) {
        fun bindItem(state: State) {
            binding.stateName.text = state.name
            binding.stateNickname.text = state.nickname
        }
        //initialize an on-click listener for the view
        init {
            binding.root.setOnClickListener {
                listener.onItemClick(absoluteAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RvRowBinding.inflate(LayoutInflater.from(parent.context), parent, false), listener)
    }

    override fun getItemCount(): Int {
        return statesCollection.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val state = statesCollection[position]
        holder.bindItem(state)

    }
}