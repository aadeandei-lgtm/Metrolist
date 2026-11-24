/*
 * Metrolist Project (C) 2026
 * Licensed under GPL-3.0 | See git history for contributors
 */

package com.metrolist.android.onboarding

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class HeadUnitDefaultsTest {
    @Test
    fun appliesOnlyOnTheHeadUnitBuildAndOnlyOnce() {
        assertTrue(shouldApplyHeadUnitDefaults(buildApplies = true, alreadyApplied = false))
        assertFalse(shouldApplyHeadUnitDefaults(buildApplies = true, alreadyApplied = true))
        assertFalse(shouldApplyHeadUnitDefaults(buildApplies = false, alreadyApplied = false))
        assertFalse(shouldApplyHeadUnitDefaults(buildApplies = false, alreadyApplied = true))
    }
}
