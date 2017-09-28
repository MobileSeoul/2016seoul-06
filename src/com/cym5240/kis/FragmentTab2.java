package com.cym5240.kis;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;
import com.cym5240.kis.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class FragmentTab2 extends Fragment implements
		OnMyLocationChangeListener {

	private static final String HALLOtbrN_ORANGE = "#FF7F27";
	private static final String ARG_POSITION = "position";
	private int position;
	GoogleMap mGoogleMap;
	GoogleMap mGoogleMap1;

	MarkerOptions optSecond = new MarkerOptions();
	LatLng loc;
	CameraPosition cp;
	MarkerOptions marker = new MarkerOptions().position(loc); // ���۸ʿ� �⺻��Ŀ ǥ��
	final MarkerOptions op1 = new MarkerOptions();

	Marker m;
	static View rootView;

	double distance;
	String tempadd[] = { "û�ʹ���ä", "������ڹ���", "������", "�ƺ��ؾ��ī��", "���ǵ� ��������",
			"�����߾ӹڹ���", "��󳪶�", "������ �μ� �ڹ���", "������ö��63", "���̳��͸�����", "Ű�ڴϾ�", "���빮�ڿ���ڹ���",
			"���ѹα�����ڹ���", "���빮�������ö���", "����ִϸ��̼Ǽ���", "�����̴����", "�Ƿη���ũ", "�ڿ��� ����Ƹ���", "�������", "������̹μӹڹ���",
			"���� �������°���", "�������", "����������ð�", "������ùڹ���" };

	TextView a1;
	TextView a2;
	TextView a3;
	TextView a4;
	TextView a5;
	TextView a6;

	TextView ok;
	TextView no;

	ImageView e1;
	ImageView e2;
	ImageView e3;
	ImageView e4;
	ImageView e5;
	ImageView e6;

	String test;
	double[] address = new double[24];
	double[] address2 = new double[24];

	double temp1;
	double temp2;
	double temp3;
	double temp4;
	double temp5;
	double temp6;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// Ű���� ���� //
		// getActivity().getWindow().setSoftInputMode(
		// WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		// ���۸��� ����ϴ� �����׸�Ʈ���� ���� ��ä �ı�

		try {
			rootView = inflater.inflate(R.layout.maptest, container, false);
		} catch (InflateException e) {
			// ���۸� View�� �̹� inflate�Ǿ� �ִ� �����̹Ƿ�, ������ �����մϴ�. }
		}

		a1 = (TextView) rootView.findViewById(R.id.textView1);
		a2 = (TextView) rootView.findViewById(R.id.textView2);
		a3 = (TextView) rootView.findViewById(R.id.textView3);
		a4 = (TextView) rootView.findViewById(R.id.textView4);
		a5 = (TextView) rootView.findViewById(R.id.textView5);
		a6 = (TextView) rootView.findViewById(R.id.textView6);

		e1 = (ImageView) rootView.findViewById(R.id.imageView1);
		e2 = (ImageView) rootView.findViewById(R.id.imageView2);
		e3 = (ImageView) rootView.findViewById(R.id.imageView3);
		e4 = (ImageView) rootView.findViewById(R.id.imageView4);
		e5 = (ImageView) rootView.findViewById(R.id.imageView5);
		e6 = (ImageView) rootView.findViewById(R.id.imageView6);

		mGoogleMap = ((SupportMapFragment) getChildFragmentManager()
				.findFragmentById(R.id.maptest)).getMap();
		// ȭ�鿡 ���۸� ǥ��
		// ������ġ�� �̵�

		mGoogleMap.getUiSettings().setZoomControlsEnabled(true);

		// Enabling MyLocation Layer of Google Map
		mGoogleMap.setMyLocationEnabled(true);
		locationTag = true;
		// Setting event handler for location change
		mGoogleMap.setOnMyLocationChangeListener(this);

		// ���� �����׸�Ʈ���� ������

		// ���� �� ������ ����
		String context = Context.LOCATION_SERVICE;
		LocationManager mgr = (LocationManager) getActivity().getSystemService(
				Context.LOCATION_SERVICE);
		if (!mgr.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
			alertCheckGPS();

		} else {

			// �Ⱥ��� �� ������ ����

		}

		return rootView;

	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		if (rootView != null) {
			ViewGroup parent = (ViewGroup) rootView.getParent();
			if (parent != null) {
				parent.removeView(rootView);
			}
		}
	}

	private void alertCheckGPS() {
		AlertDialog.Builder builder = new AlertDialog.Builder(
				this.getActivity());
		;
		builder.setMessage(
				"Google�� ��ġ ���񽺿��� �͸��� ��ġ ������ ������ �� �ֵ��� �մϴ�. ��ġ ���������ʹ� �����Ǵ� ���α�⿡ �������� ������ �ܼ��� Ȱ���Ͽ� ���� ��ġ���� ����� ������� �˻��ϱ����� ���˴ϴ�.")
				.setCancelable(false)
				.setPositiveButton("����", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();

					}
				})
				.setNegativeButton("����", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						moveConfigGPS();
					}
				});
		AlertDialog alert = builder.create();
		alert.show();
	}

	// GPS ����ȭ������ �̵�
	private void moveConfigGPS() {
		Intent gpsOptionsIntent = new Intent(
				android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
		startActivity(gpsOptionsIntent);
	}

	boolean locationTag = true;

	@Override
	public void onMyLocationChange(Location location) {

		if (locationTag) {
			// TODO Auto-generated method stub

			// ���� ����
			double latitude = location.getLatitude();

			// ���� �浵
			double longitude = location.getLongitude();

			// latLng������ ���� ����, �浵�� ����
			loc = new LatLng(latitude, longitude);

			// ���� ��ġ�� ���۸� �̵�
			// mGoogleMap.moveCapila(CapilaUpaquarteFactory.newLatLng(latLng));
			// Ȯ�� �� ���(Zoom)
			// mGoogleMap.animateCapila(CapilaUpaquarteFactory.zoomTo(17));

			// ��Ŀ,Ÿ��Ʋ, ������ ǥ��
			if (m != null) {
				m.remove(); // ������Ŀ�����
			}
			cp = new CameraPosition.Builder().target((loc)).zoom(9).build();
			mGoogleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cp));
			marker = new MarkerOptions()
					.icon(BitmapDescriptorFactory
							.fromResource(R.drawable.map_picker_blue_36dp))
					.position(loc).title("������ġ");
			m = mGoogleMap.addMarker(marker);
			mGoogleMap.addMarker(marker).showInfoWindow();
			mGoogleMap.getUiSettings().setZoomControlsEnabled(true);

			Location locationA = new Location("point A");

			locationA.setLatitude(latitude);
			locationA.setLongitude(longitude);

			Location location0 = new Location("point B");
			Location location1 = new Location("point B");
			Location location2 = new Location("point B");
			Location location3 = new Location("point B");
			Location location4 = new Location("point B");
			Location location5 = new Location("point B");
			Location location6 = new Location("point B");
			Location location7 = new Location("point B");
			Location location8 = new Location("point B");
			Location location9 = new Location("point B");
			Location location10 = new Location("point B");
			Location location11 = new Location("point B");
			Location location12 = new Location("point B");
			Location location13 = new Location("point B");
			Location location14 = new Location("point B");
			Location location15 = new Location("point B");
			Location location16 = new Location("point B");
			Location location17 = new Location("point B");
			Location location18 = new Location("point B");
			Location location19 = new Location("point B");
			Location location20 = new Location("point B");
			Location location21 = new Location("point B");
			Location location22 = new Location("point B");
			Location location23 = new Location("point B");

			location0.setLatitude(37.582584);
			location0.setLongitude(126.973138);
			location1.setLatitude(37.539226);
			location1.setLongitude(126.841743);
			location2.setLatitude(37.571757);
			location2.setLongitude(127.015292);
			location3.setLatitude(37.582945);
			location3.setLongitude(127.002630);
			location4.setLatitude(37.530799);
			location4.setLongitude(126.928343);
			location5.setLatitude(37.523868);
			location5.setLongitude(126.980481);
			location6.setLatitude(37.550575);
			location6.setLongitude(127.077580);
			location7.setLatitude(37.554472);
			location7.setLongitude(126.981164);
			location8.setLatitude(37.519437);
			location8.setLongitude(126.939728);
			location9.setLatitude(37.571725);
			location9.setLongitude(126.987267);
			location10.setLatitude(37.510738);
			location10.setLongitude(127.096789);
			location11.setLatitude(37.576691);
			location11.setLongitude(126.937834);
			location12.setLatitude(37.573824);
			location12.setLongitude(126.978100);
			location13.setLatitude(37.566725);
			location13.setLongitude(127.009474);
			location14.setLatitude(37.558249);
			location14.setLongitude(126.987902);
			location15.setLatitude(37.548216);
			location15.setLongitude(127.080837);
			location16.setLatitude(37.512542);
			location16.setLongitude(127.102425);
			location17.setLatitude(37.512634);
			location17.setLongitude(127.058860);
			location18.setLatitude(37.536935);
			location18.setLongitude(126.977070);
			location19.setLatitude(37.581674);
			location19.setLongitude(126.978948);
			location20.setLatitude(37.588059);
			location20.setLongitude(126.815235);
			location21.setLatitude(37.537005);
			location21.setLongitude(127.011430);
			location22.setLatitude(37.468999);
			location22.setLongitude(126.959251);
			location23.setLatitude(37.576566);
			location23.setLongitude(126.974884);

			distance = locationA.distanceTo(location0);
			distance = distance / 1000;
			address[0] = distance;
			address2[0] = address[0];

			distance = locationA.distanceTo(location1);
			distance = distance / 1000;
			address[1] = distance;
			address2[1] = address[1];

			distance = locationA.distanceTo(location2);
			distance = distance / 1000;
			address[2] = distance;
			address2[2] = address[2];

			distance = locationA.distanceTo(location3);
			distance = distance / 1000;
			address[3] = distance;
			address2[3] = address[3];

			distance = locationA.distanceTo(location4);
			distance = distance / 1000;
			address[4] = distance;
			address2[4] = address[4];

			distance = locationA.distanceTo(location5);
			distance = distance / 1000;
			address[5] = distance;
			address2[5] = address[5];

			distance = locationA.distanceTo(location6);
			distance = distance / 1000;
			address[6] = distance;
			address2[6] = address[6];

			distance = locationA.distanceTo(location7);
			distance = distance / 1000;
			address[7] = distance;
			address2[7] = address[7];

			distance = locationA.distanceTo(location8);
			distance = distance / 1000;
			address[8] = distance;
			address2[8] = address[8];

			distance = locationA.distanceTo(location9);
			distance = distance / 1000;
			address[9] = distance;
			address2[9] = address[9];

			distance = locationA.distanceTo(location10);
			distance = distance / 1000;
			address[10] = distance;
			address2[10] = address[10];

			distance = locationA.distanceTo(location11);
			distance = distance / 1000;
			address[11] = distance;
			address2[11] = address[11];

			distance = locationA.distanceTo(location12);
			distance = distance / 1000;
			address[12] = distance;
			address2[12] = address[12];

			distance = locationA.distanceTo(location13);
			distance = distance / 1000;
			address[13] = distance;
			address2[13] = address[13];

			distance = locationA.distanceTo(location14);
			distance = distance / 1000;
			address[14] = distance;
			address2[14] = address[14];

			distance = locationA.distanceTo(location15);
			distance = distance / 1000;
			address[15] = distance;
			address2[15] = address[15];

			distance = locationA.distanceTo(location16);
			distance = distance / 1000;
			address[16] = distance;
			address2[16] = address[16];

			distance = locationA.distanceTo(location17);
			distance = distance / 1000;
			address[17] = distance;
			address2[17] = address[17];

			distance = locationA.distanceTo(location18);
			distance = distance / 1000;
			address[18] = distance;
			address2[18] = address[18];

			distance = locationA.distanceTo(location19);
			distance = distance / 1000;
			address[19] = distance;
			address2[19] = address[19];

			distance = locationA.distanceTo(location20);
			distance = distance / 1000;
			address[20] = distance;
			address2[20] = address[20];

			distance = locationA.distanceTo(location21);
			distance = distance / 1000;
			address[21] = distance;
			address2[21] = address[21];

			distance = locationA.distanceTo(location22);
			distance = distance / 1000;
			address[22] = distance;
			address2[22] = address[22];

			distance = locationA.distanceTo(location23);
			distance = distance / 1000;
			address[23] = distance;
			address2[23] = address[23];

			double temp = 0;

			for (int i = 0; i < address.length; i++) {
				for (int j = i + 1; j < address.length; j++) {
					if (address[i] > address[j]) {
						temp = address[j];
						address[j] = address[i];
						address[i] = temp;
					}
				}
			}

			temp1 = address[0];
			temp2 = address[1];
			temp3 = address[2];
			temp4 = address[3];
			temp5 = address[4];
			temp6 = address[5];

			test = Double.toString(address[0]);
			test = String.format("%.2f", address[0]);
			a1.setText(test + "Km");

			if (temp1 == address2[0]) {
				e1.setImageResource(R.drawable.chsa);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[1]) {
				e1.setImageResource(R.drawable.chgon);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar2.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[2]) {
				e1.setImageResource(R.drawable.teji);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar3.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[3]) {
				e1.setImageResource(R.drawable.fishc);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar4.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[4]) {
				e1.setImageResource(R.drawable.mbg);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar5.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[5]) {
				e1.setImageResource(R.drawable.gjg);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar6.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[6]) {
				e1.setImageResource(R.drawable.ssnr);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar7.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[7]) {
				e1.setImageResource(R.drawable.msgy);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar8.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[8]) {
				e1.setImageResource(R.drawable.aquar);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar9.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[9]) {
				e1.setImageResource(R.drawable.dina);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar10.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[10]) {
				e1.setImageResource(R.drawable.kisa);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar11.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[11]) {
				e1.setImageResource(R.drawable.jasa);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar12.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[12]) {
				e1.setImageResource(R.drawable.dys);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar13.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[13]) {
				e1.setImageResource(R.drawable.ddp);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar14.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[14]) {
				e1.setImageResource(R.drawable.anime);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar15.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[15]) {
				e1.setImageResource(R.drawable.seokid);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar16.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[16]) {
				e1.setImageResource(R.drawable.pororo);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar17.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[17]) {
				e1.setImageResource(R.drawable.exaq);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar18.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[18]) {
				e1.setImageResource(R.drawable.jjg);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar19.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[19]) {
				e1.setImageResource(R.drawable.emg);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar20.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[20]) {
				e1.setImageResource(R.drawable.gss);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar21.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[21]) {
				e1.setImageResource(R.drawable.dmu);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar22.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[22]) {
				e1.setImageResource(R.drawable.sgh);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar23.class);
						startActivity(intent2);
					}

				});
			} else if (temp1 == address2[23]) {
				e1.setImageResource(R.drawable.grg);
				e1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar24.class);
						startActivity(intent2);
					}

				});
			}

			test = Double.toString(address[1]);
			test = String.format("%.2f", address[1]);
			a2.setText(test + "Km");

			if (temp2 == address2[0]) {
				e2.setImageResource(R.drawable.chsa);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[1]) {
				e2.setImageResource(R.drawable.chgon);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar2.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[2]) {
				e2.setImageResource(R.drawable.teji);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar3.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[3]) {
				e2.setImageResource(R.drawable.fishc);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar4.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[4]) {
				e2.setImageResource(R.drawable.mbg);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar5.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[5]) {
				e2.setImageResource(R.drawable.gjg);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar6.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[6]) {
				e2.setImageResource(R.drawable.ssnr);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar7.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[7]) {
				e2.setImageResource(R.drawable.msgy);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar8.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[8]) {
				e2.setImageResource(R.drawable.aquar);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar9.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[9]) {
				e2.setImageResource(R.drawable.dina);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar10.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[10]) {
				e2.setImageResource(R.drawable.kisa);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar11.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[11]) {
				e2.setImageResource(R.drawable.jasa);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar12.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[12]) {
				e2.setImageResource(R.drawable.dys);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar13.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[13]) {
				e2.setImageResource(R.drawable.ddp);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar14.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[14]) {
				e2.setImageResource(R.drawable.anime);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar15.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[15]) {
				e2.setImageResource(R.drawable.seokid);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar16.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[16]) {
				e2.setImageResource(R.drawable.pororo);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar17.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[17]) {
				e2.setImageResource(R.drawable.exaq);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar18.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[18]) {
				e2.setImageResource(R.drawable.jjg);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar19.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[19]) {
				e2.setImageResource(R.drawable.emg);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar20.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[20]) {
				e2.setImageResource(R.drawable.gss);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar21.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[21]) {
				e2.setImageResource(R.drawable.dmu);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar22.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[22]) {
				e2.setImageResource(R.drawable.sgh);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar23.class);
						startActivity(intent2);
					}

				});
			} else if (temp2 == address2[23]) {
				e2.setImageResource(R.drawable.grg);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar24.class);
						startActivity(intent2);
					}

				});
			}

			test = Double.toString(address[2]);
			test = String.format("%.2f", address[2]);
			a3.setText(test + "Km");
			if (temp3 == address2[0]) {
				e3.setImageResource(R.drawable.chsa);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[1]) {
				e3.setImageResource(R.drawable.chgon);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar2.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[2]) {
				e3.setImageResource(R.drawable.teji);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar3.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[3]) {
				e3.setImageResource(R.drawable.fishc);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar4.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[4]) {
				e3.setImageResource(R.drawable.mbg);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar5.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[5]) {
				e3.setImageResource(R.drawable.gjg);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar6.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[6]) {
				e3.setImageResource(R.drawable.ssnr);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar7.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[7]) {
				e3.setImageResource(R.drawable.msgy);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar8.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[8]) {
				e3.setImageResource(R.drawable.aquar);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar9.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[9]) {
				e3.setImageResource(R.drawable.dina);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar10.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[10]) {
				e3.setImageResource(R.drawable.kisa);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar11.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[11]) {
				e3.setImageResource(R.drawable.jasa);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar12.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[12]) {
				e3.setImageResource(R.drawable.dys);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar13.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[13]) {
				e3.setImageResource(R.drawable.ddp);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar14.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[14]) {
				e3.setImageResource(R.drawable.anime);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar15.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[15]) {
				e3.setImageResource(R.drawable.seokid);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar16.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[16]) {
				e3.setImageResource(R.drawable.pororo);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar17.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[17]) {
				e3.setImageResource(R.drawable.exaq);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar18.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[18]) {
				e3.setImageResource(R.drawable.jjg);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar19.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[19]) {
				e3.setImageResource(R.drawable.emg);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar20.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[20]) {
				e3.setImageResource(R.drawable.gss);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar21.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[21]) {
				e3.setImageResource(R.drawable.dmu);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar22.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[22]) {
				e3.setImageResource(R.drawable.sgh);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar23.class);
						startActivity(intent2);
					}

				});
			} else if (temp3 == address2[23]) {
				e3.setImageResource(R.drawable.grg);
				e3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar24.class);
						startActivity(intent2);
					}

				});
			}

			test = Double.toString(address[3]);
			test = String.format("%.2f", address[3]);
			a4.setText(test + "Km");
			if (temp4 == address2[0]) {
				e4.setImageResource(R.drawable.chsa);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[1]) {
				e4.setImageResource(R.drawable.chgon);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar2.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[2]) {
				e4.setImageResource(R.drawable.teji);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar3.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[3]) {
				e4.setImageResource(R.drawable.fishc);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar4.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[4]) {
				e4.setImageResource(R.drawable.mbg);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar5.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[5]) {
				e4.setImageResource(R.drawable.gjg);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar6.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[6]) {
				e4.setImageResource(R.drawable.ssnr);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar7.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[7]) {
				e4.setImageResource(R.drawable.msgy);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar8.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[8]) {
				e4.setImageResource(R.drawable.aquar);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar9.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[9]) {
				e4.setImageResource(R.drawable.dina);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar10.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[10]) {
				e4.setImageResource(R.drawable.kisa);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar11.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[11]) {
				e4.setImageResource(R.drawable.jasa);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar12.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[12]) {
				e4.setImageResource(R.drawable.dys);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar13.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[13]) {
				e4.setImageResource(R.drawable.ddp);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar14.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[14]) {
				e4.setImageResource(R.drawable.anime);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar15.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[15]) {
				e4.setImageResource(R.drawable.seokid);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar16.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[16]) {
				e4.setImageResource(R.drawable.pororo);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar17.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[17]) {
				e4.setImageResource(R.drawable.exaq);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar18.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[18]) {
				e4.setImageResource(R.drawable.jjg);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar19.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[19]) {
				e4.setImageResource(R.drawable.emg);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar20.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[20]) {
				e4.setImageResource(R.drawable.gss);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar21.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[21]) {
				e4.setImageResource(R.drawable.dmu);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar22.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[22]) {
				e4.setImageResource(R.drawable.sgh);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar23.class);
						startActivity(intent2);
					}

				});
			} else if (temp4 == address2[23]) {
				e4.setImageResource(R.drawable.grg);
				e4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar24.class);
						startActivity(intent2);
					}

				});
			}

			test = Double.toString(address[4]);
			test = String.format("%.2f", address[4]);
			a5.setText(test + "Km");
			if (temp5 == address2[0]) {
				e5.setImageResource(R.drawable.chsa);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[1]) {
				e5.setImageResource(R.drawable.chgon);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar2.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[2]) {
				e5.setImageResource(R.drawable.teji);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar3.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[3]) {
				e5.setImageResource(R.drawable.fishc);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar4.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[4]) {
				e5.setImageResource(R.drawable.mbg);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar5.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[5]) {
				e5.setImageResource(R.drawable.gjg);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar6.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[6]) {
				e5.setImageResource(R.drawable.ssnr);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar7.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[7]) {
				e5.setImageResource(R.drawable.msgy);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar8.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[8]) {
				e5.setImageResource(R.drawable.aquar);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar9.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[9]) {
				e5.setImageResource(R.drawable.dina);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar10.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[10]) {
				e5.setImageResource(R.drawable.kisa);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar11.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[11]) {
				e5.setImageResource(R.drawable.jasa);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar12.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[12]) {
				e5.setImageResource(R.drawable.dys);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar13.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[13]) {
				e5.setImageResource(R.drawable.ddp);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar14.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[14]) {
				e5.setImageResource(R.drawable.anime);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar15.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[15]) {
				e5.setImageResource(R.drawable.seokid);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar16.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[16]) {
				e5.setImageResource(R.drawable.pororo);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar17.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[17]) {
				e5.setImageResource(R.drawable.exaq);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar18.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[18]) {
				e5.setImageResource(R.drawable.jjg);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar19.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[19]) {
				e5.setImageResource(R.drawable.emg);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar20.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[20]) {
				e5.setImageResource(R.drawable.gss);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar21.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[21]) {
				e5.setImageResource(R.drawable.dmu);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar22.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[22]) {
				e2.setImageResource(R.drawable.sgh);
				e2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar23.class);
						startActivity(intent2);
					}

				});
			} else if (temp5 == address2[23]) {
				e5.setImageResource(R.drawable.grg);
				e5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar24.class);
						startActivity(intent2);
					}

				});
			}

			test = Double.toString(address[5]);
			test = String.format("%.2f", address[5]);
			a6.setText(test + "Km");
			if (temp6 == address2[0]) {
				e6.setImageResource(R.drawable.chsa);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[1]) {
				e6.setImageResource(R.drawable.chgon);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar2.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[2]) {
				e6.setImageResource(R.drawable.teji);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar3.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[3]) {
				e6.setImageResource(R.drawable.fishc);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar4.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[4]) {
				e6.setImageResource(R.drawable.mbg);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar5.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[5]) {
				e6.setImageResource(R.drawable.gjg);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar6.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[6]) {
				e6.setImageResource(R.drawable.ssnr);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar7.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[7]) {
				e6.setImageResource(R.drawable.msgy);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar8.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[8]) {
				e6.setImageResource(R.drawable.aquar);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar9.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[9]) {
				e6.setImageResource(R.drawable.dina);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar10.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[10]) {
				e6.setImageResource(R.drawable.kisa);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar11.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[11]) {
				e6.setImageResource(R.drawable.jasa);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar12.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[12]) {
				e6.setImageResource(R.drawable.dys);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar13.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[13]) {
				e6.setImageResource(R.drawable.ddp);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar14.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[14]) {
				e6.setImageResource(R.drawable.anime);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar15.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[15]) {
				e6.setImageResource(R.drawable.seokid);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar16.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[16]) {
				e6.setImageResource(R.drawable.pororo);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar17.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[17]) {
				e6.setImageResource(R.drawable.exaq);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar18.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[18]) {
				e6.setImageResource(R.drawable.jjg);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar19.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[19]) {
				e6.setImageResource(R.drawable.emg);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar20.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[20]) {
				e6.setImageResource(R.drawable.gss);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar21.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[21]) {
				e6.setImageResource(R.drawable.dmu);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar22.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[22]) {
				e6.setImageResource(R.drawable.sgh);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar23.class);
						startActivity(intent2);
					}

				});
			} else if (temp6 == address2[23]) {
				e6.setImageResource(R.drawable.grg);
				e6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						Intent intent2 = new Intent(getActivity(),
								actionbar24.class);
						startActivity(intent2);
					}

				});
			}

			mGoogleMap.addMarker(optSecond
					.position(new LatLng(37.582584, 126.973138)).title("û�ʹ���ä")
					.snippet("����Ư���� ���α� ȿ�ڷ�13��..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.539226, 126.841743)).title("������ڹ���")
					.snippet("����Ư���� ������ ������ 139..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.571757, 127.015292)).title("������")
					.snippet("����Ư���� ���α� ������ 19..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.582945, 127.002630))
					.title("�ƺ��ؾ��ī��")
					.snippet("����Ư���� ���α� ���з�8���� 52 ..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.530799, 126.928343)).title("���ǵ� ��������")
					.snippet("����Ư���� �������� ���ǵ��� 330..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.523868, 126.980481))
					.title("�����߾ӹڹ���").snippet("����Ư���� ��걸 ������� 137..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.550575, 127.077580))
					.title("��󳪶�").snippet("����Ư���� ������ �ɵ��� 216..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.554472, 126.981164)).title("������ �μ� �ڹ���")
					.snippet("����Ư���� �߱� ���ķ� 46..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.519437, 126.939728)).title("������ö��63")
					.snippet("����Ư���� �������� 63�� 50..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.571725, 126.987267)).title("���̳��͸�����")
					.snippet("����Ư���� ���α� �λ絿�� 12..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.510738, 127.096789)).title("Ű�ڴϾ�")
					.snippet("����Ư���� ���ı� �ø��ȷ� 240..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.576691, 126.937834)).title("���빮�ڿ���ڹ���")
					.snippet("����Ư���� ���빮�� �����32��..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.573824, 126.978100)).title("���ѹα�����ڹ���")
					.snippet("����Ư���� ���α� �������..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.566725, 127.009474)).title("���빮�������ö���")
					.snippet("����Ư���� �߱� ������ 281..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.558249, 126.987902)).title("����ִϸ��̼Ǽ���")
					.snippet("����Ư���� �߱� ���ķ� 126..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.548216, 127.080837)).title("�����̴����")
					.snippet("����Ư���� ������ �ɵ��� 216..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.512542, 127.102425)).title("�Ƿη���ũ")
					.snippet("����Ư���� ���ı� �ø��ȷ�..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.512634, 127.058860))
					.title("�ڿ��� ����Ƹ���").snippet("����Ư���� ������ �������..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.536935, 126.977070)).title("�������")
					.snippet("����Ư���� ��걸 ���¿��� 29..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.581674, 126.978948)).title("������̹μӹڹ���")
					.snippet("����Ư���� ���α� ��û�� 37..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.588059, 126.815235)).title("���� �������°���")
					.snippet("����Ư���� ������ ��ȭ��..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.537005, 127.011430))
					.title("�������").snippet("����Ư���� ��걸 �������29��..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.468999, 126.959251))
					.title("����������ð�").snippet("����Ư���� ���Ǳ� ������� 101..   ���ڼ���"));
			mGoogleMap.addMarker(new MarkerOptions()
					.position(new LatLng(37.576566, 126.974884)).title("������ùڹ���")
					.snippet("����Ư���� ���α� ȿ�ڷ� 12..   ���ڼ���"));

			mGoogleMap
					.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {

						@Override
						public void onInfoWindowClick(Marker marker) {

							if (tempadd[0].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar.class);
								startActivity(intent2);
							} else if (tempadd[1].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar2.class);
								startActivity(intent2);
							} else if (tempadd[2].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar3.class);
								startActivity(intent2);
							} else if (tempadd[3].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar4.class);
								startActivity(intent2);
							} else if (tempadd[4].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar5.class);
								startActivity(intent2);
							} else if (tempadd[5].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar6.class);
								startActivity(intent2);
							} else if (tempadd[6].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar7.class);
								startActivity(intent2);
							} else if (tempadd[7].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar8.class);
								startActivity(intent2);
							} else if (tempadd[8].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar9.class);
								startActivity(intent2);
							} else if (tempadd[9].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar10.class);
								startActivity(intent2);
							} else if (tempadd[10].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar11.class);
								startActivity(intent2);
							} else if (tempadd[11].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar12.class);
								startActivity(intent2);
							} else if (tempadd[12].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar13.class);
								startActivity(intent2);
							} else if (tempadd[13].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar14.class);
								startActivity(intent2);
							} else if (tempadd[14].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar15.class);
								startActivity(intent2);
							} else if (tempadd[15].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar16.class);
								startActivity(intent2);
							} else if (tempadd[16].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar17.class);
								startActivity(intent2);
							} else if (tempadd[17].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar18.class);
								startActivity(intent2);
							} else if (tempadd[18].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar19.class);
								startActivity(intent2);
							} else if (tempadd[19].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar20.class);
								startActivity(intent2);
							} else if (tempadd[20].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar21.class);
								startActivity(intent2);
							} else if (tempadd[21].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar22.class);
								startActivity(intent2);
							} else if (tempadd[22].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar23.class);
								startActivity(intent2);
							} else if (tempadd[23].equals(marker.getTitle())) {
								Intent intent2 = new Intent(getActivity(),
										actionbar24.class);
								startActivity(intent2);
							}

							// click�� infowindow�� marker�� ���� �ȴ�.

						}

					});

			// ��Ŀ�� Ŭ������ �� ȣ���
			mGoogleMap.setOnMarkerClickListener(new OnMarkerClickListener() {

				@Override
				public boolean onMarkerClick(Marker marker) {

					// TODO Auto-generated method stub

					return false;

				}

			});
		}
		locationTag = false;
	}

}