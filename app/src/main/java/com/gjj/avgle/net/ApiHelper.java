/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.gjj.avgle.net;

import com.gjj.avgle.net.model.CollectionResponse;
import com.gjj.avgle.net.model.VideoDetail;
import com.gjj.avgle.net.model.VideoResponse;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Created by janisharali on 27/01/17.
 */

public interface ApiHelper {


    Observable<VideoResponse> getVideos(int pageNo, String c);

    Observable<Response<ResponseBody>> getPlayVideoUrl(String url);

    Observable<VideoResponse> searchVideo(String query, int page);

    Observable<CollectionResponse> getFavorites(int start, int end);

    Observable<VideoDetail> getDetail(int vid);

}
