package cntt61.s61136475;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DataAdapter extends BaseAdapter {
    private Activity activity;
    private String[] items;

    public DataAdapter(Activity activity, String[] items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();

        view = inflater.inflate(R.layout.item, null);

        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        tvName.setText(items[i]);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        if (items[i].length() > 3){
            imageView.setImageResource(R.drawable.traidat);
        } else {
            imageView.setImageResource(R.drawable.ngoisao);
        }
        return view;
    }
}

