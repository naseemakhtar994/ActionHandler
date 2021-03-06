/*
 *  Copyright Roman Donchenko. All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.drextended.actionhandler.listener;

import android.view.View;

/**
 * Interface definition for a callback to be invoked when an action is executed successfully.
 */
public interface OnActionFiredListener {

    /**
     * Called after an action is executed successfully.
     *
     * @param view       The View, which can be used for prepare any visual effect (like animation),
     * @param actionType The action type, which appointed to the view
     * @param model      The model, which  appointed to the view and should be handled
     */
    void onActionFired(View view, String actionType, Object model);
}
