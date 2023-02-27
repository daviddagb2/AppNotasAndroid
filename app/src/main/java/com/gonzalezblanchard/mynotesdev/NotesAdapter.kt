package com.gonzalezblanchard.mynotesdev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gonzalezblanchard.mynotesdev.databinding.NoteElementBinding


class NotesAdapter : ListAdapter<Note, NoteViewHolder>(NoteDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): NoteViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_element, parent, false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int){
        holder.bind(getItem(position))
    }
}

class NoteDiffCallback : DiffUtil.ItemCallback<Note>() {
    override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
       return oldItem == newItem
    }
}

class NoteViewHolder(view: View): RecyclerView.ViewHolder(view){
    private val binding = NoteElementBinding.bind(view)
    fun bind(note: Note){
        binding.title.text = note.title
    }
}