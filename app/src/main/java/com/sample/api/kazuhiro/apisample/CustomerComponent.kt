package com.sample.api.kazuhiro.apisample

import dagger.Subcomponent

/**
 * Created by ryosuke on 2018/02/14.
 */

@CustomerScope
@Subcomponent
interface CustomerComponent {

    fun enter(): Customer

    @Subcomponent.Builder
    interface Builder {
        fun build(): CustomerComponent
    }
}
