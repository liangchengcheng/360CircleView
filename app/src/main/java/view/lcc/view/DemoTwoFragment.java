package view.lcc.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import view.lcc.ratingview.RatingBar;
import view.lcc.ratingview.RatingView;

/**
 * Author:       梁铖城
 * Email:        1038127753@qq.com
 * Date:
 * Description:
 */
public class DemoTwoFragment extends Fragment{
    View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.demo_two_fragment_view, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void initView() {
        final RatingView view = (RatingView) rootView.findViewById(R.id.rating_view);
        view.addRatingBar(new RatingBar(8, "语文"));
        view.addRatingBar(new RatingBar(6, "数学"));
        view.addRatingBar(new RatingBar(7, "英语"));
        view.addRatingBar(new RatingBar(9, "化学"));
        view.addRatingBar(new RatingBar(3, "历史"));
        view.addRatingBar(new RatingBar(10, "生物"));
        view.addRatingBar(new RatingBar(2, "政治"));
        view.addRatingBar(new RatingBar(6, "地理"));
        view.show();
    }
}
