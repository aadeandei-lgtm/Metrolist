/*
 * Metrolist Project (C) 2026
 * Licensed under GPL-3.0 | See git history for contributors
 */

package com.metrolist.android.onboarding

import com.metrolist.shared.settings.Settings

/**
 * The headless head-unit build ships features a car head unit cannot use but which cost RAM and CPU
 * while the app runs: home-screen widgets, music recognition, mDNS cast discovery, Last.fm network
 * calls, Listen Together sessions, Discord RPC, podcasts, in-app music videos, animated artwork and
 * gapless crossfade, all enabled by default.
 *
 * This turns them off once, on the first launch of the head-unit build. It is a migration, not a
 * hard default: every switch stays visible in Settings, so the user can turn any of them back on.
 * That keeps the fork mergeable against upstream (no feature code is deleted) while the head unit
 * starts lean.
 */
internal fun shouldApplyHeadUnitDefaults(buildApplies: Boolean, alreadyApplied: Boolean): Boolean =
    buildApplies && !alreadyApplied

internal fun applyHeadUnitDefaults(settings: Settings = Settings.shared) {
    settings.animatedArtworkCacheSize = 0
    settings.crossfadeGapless = false
    settings.castEnabled = false
    settings.lastFmEnabled = false
    settings.listenTogetherEnabled = false
    settings.enableDiscordIntegration = false
    settings.hidePodcasts = true
    settings.videoViewerVisible = false
}
