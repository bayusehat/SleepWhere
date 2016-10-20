package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere;

import android.support.v7.widget.RecyclerView;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;
/**
 * Created by Arya on 14/10/2016.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView tv1,tv2;
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);
        tv2= (TextView) itemView.findViewById(R.id.daftar_deskripsi);
        imageView= (ImageView) itemView.findViewById(R.id.daftar_icon);
    }
}