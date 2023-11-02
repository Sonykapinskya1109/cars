package com.mralevas.auto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StateAdapter extends ArrayAdapter<State> {

   private LayoutInflater inflater;
   private int layout;
   private List<State> states;

   public StateAdapter(Context context, int resource, List<State> states) {
      super(context, resource, states);
      this.states = states;
      this.layout = resource;
      this.inflater = LayoutInflater.from(context);
   }
   public View getView(int position, View convertView, ViewGroup parent) {

      View view=inflater.inflate(this.layout, parent, false);

      ImageView imgView = view.findViewById(R.id.img);
      TextView nameView = view.findViewById(R.id.name);
      TextView modelView = view.findViewById(R.id.mod);

      State state = states.get(position);

      imgView.setImageResource(state.getImgResource());
      nameView.setText(state.getName());
      modelView.setText(state.getModel());

      return view;



   }
}
