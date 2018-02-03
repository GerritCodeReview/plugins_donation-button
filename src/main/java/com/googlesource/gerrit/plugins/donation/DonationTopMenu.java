// Copyright (C) 2018 GerritForge Ltd
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.googlesource.gerrit.plugins.donation;

import com.google.gerrit.extensions.client.MenuItem;
import com.google.gerrit.extensions.webui.TopMenu;

import java.util.Arrays;
import java.util.List;

public class DonationTopMenu implements TopMenu {

    private final List<TopMenu.MenuEntry> menuEntries;

    public DonationTopMenu() {
        this.menuEntries =
                Arrays.asList(
                        new TopMenu.MenuEntry(
                                "MAKE A DONATION",
                                Arrays.asList(
                                        new MenuItem("Donate to Shawn Pearce Memorial Fund",
                                                "https://goo.gl/MDaxxP",
                                                "_blank",
                                                "donate"))));
    }

    @Override
    public List<MenuEntry> getEntries() {
        return menuEntries;
    }
}
