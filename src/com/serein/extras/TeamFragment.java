/*
 * Copyright (C) 2017 The Dirty Unicorns Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.serein.extras;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class TeamFragment extends DialogFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final ViewGroup nullParent = null;
        View view = null;
        if (inflater != null) {
            view = inflater.inflate(R.layout.teamdialog, nullParent);
        }
        alertDialogBuilder.setView(view);
        alertDialogBuilder.setCancelable(false);
        final AlertDialog dialog = alertDialogBuilder.create();
        dialog.show();

        FrameLayout myron = null;
        if (view != null) {
            myron = view.findViewById(R.id.myron);
        }
        if (myron != null) {
            myron.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_myron, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();
                }
           });
        }

        FrameLayout oveno = null;
        if (view != null) {
            oveno = view.findViewById(R.id.oveno);
        }
        if (oveno != null) {
            oveno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_oveno, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();
                }
           });
        }

        FrameLayout rahif = null;
        if (view != null) {
           rahif = view.findViewById(R.id.rahif);
        }
        if (rahif != null) {
            rahif.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_rahif, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();
                }
           });
        }

        FrameLayout amulya = null;
        if (view != null) {
            amulya = view.findViewById(R.id.amulya);
        }
        if (amulya != null) {
            amulya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_amulya, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();
                }
           });
        }

        FrameLayout batman = null;
        if (view != null) {
            batman = view.findViewById(R.id.batman);
        }
        if (batman != null) {
            batman.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_batman, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();
                }
           });
        }

        FrameLayout dark = null;
        if (view != null) {
            dark = view.findViewById(R.id.dark);
        }
        if (dark != null) {
            dark.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_dark, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();
                }
           });
        }
        dialog.show();

        return dialog;
    }

    @Override
    public void onDestroyView() {
        if(getDialog()!=null && getRetainInstance()) {
            getDialog().setDismissMessage(null);

        }
        super.onDestroyView();
    }
}
