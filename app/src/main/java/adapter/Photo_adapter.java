package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.vaibhav.photos1.R;

import java.util.ArrayList;

import model.Photo_model;

public class Photo_adapter extends RecyclerView.Adapter<Photo_adapter.ViewHolder> {

    Context context;
    ArrayList<Photo_model> photo_models;

    public Photo_adapter(Context context, ArrayList<Photo_model> photo_models) {
        this.context = context;
        this.photo_models = photo_models;
    }

    @NonNull
    @Override
    public Photo_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Photo_adapter.ViewHolder holder, int position) {

        holder.image_photo.setImageResource(photo_models.get(position).getImage_photo());
    }

    @Override
    public int getItemCount() {
        return photo_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image_photo;
        public ViewHolder(View itemView) {
            super(itemView);

            image_photo = itemView.findViewById(R.id.image_photo);
        }
    }
}
