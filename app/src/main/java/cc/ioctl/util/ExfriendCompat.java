/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2022 qwq233@qwq2333.top
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */
package cc.ioctl.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import androidx.annotation.NonNull;

/**
 * Kotlin 侧访问 ExfriendManager 成员的兼容入口。
 */
public final class ExfriendCompat {

    private ExfriendCompat() {
    }

    public static boolean isNotifyWhenDeleted(@NonNull ExfriendManager m) {
        return m.isNotifyWhenDeleted();
    }

    public static void setNotifyWhenDeleted(@NonNull ExfriendManager m, boolean z) {
        m.setNotifyWhenDeleted(z);
    }

    public static void saveConfigure(@NonNull ExfriendManager m) {
        m.saveConfigure();
    }

    public static Notification createNotiComp(@NonNull ExfriendManager m, NotificationManager nm,
            String ticker, String title, String content, long[] vibration, PendingIntent pi) {
        return m.createNotiComp(nm, ticker, title, content, vibration, pi);
    }
}
