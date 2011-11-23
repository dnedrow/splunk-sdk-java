/*
 * Copyright 2011 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk;

import java.util.Date;

public class FiredAlert extends Entity {
    FiredAlert(Service service, String path) {
        super(service, path);
    }

    public String [] getAction() {
        return getStringArray("actions", null);
    }

    public String getAlertType() {
        return getString("alert_type", null);
    }

    public String getExpirationTime() {
        return getString("expiration_time_rendered", null);
    }

    public String getSavedSearchName() {
        return getString("savedsearch_name", null);
    }

    public int getSeverity() {
        return getInteger("severity", -1);
    }

    public String getSid() {
        return getString("sid", null);
    }

    public int getTriggeredAlertCount() {
        return getInteger("triggered_alerts", -1);
    }

    public Date getTriggerTime() {
        return getDateFromEpoch("trigger_time", new Date(0));
    }

    public String getTriggerTimeRendered() {
        return getString("trigger_time_rendered", null);
    }

    public boolean isDigestMode() {
        return getBoolean("digest_mode", false); // UNDONE: Correct default?
    }
}
