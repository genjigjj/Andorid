package com.gjj.avgle.ui.video;

import com.gjj.avgle.di.PerActivity;
import com.gjj.avgle.ui.base.MvpPresenter;
import com.gjj.avgle.ui.base.MvpView;

@PerActivity
public interface VideoMvpPresenter<V extends MvpView> extends MvpPresenter<V> {

    void showVideo(String c);

    void loadMoreVideo(int pageNo, String c);

    void refreshVideo(String c);

}
