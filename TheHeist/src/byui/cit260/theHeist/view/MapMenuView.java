/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.Location;
import byui.cit260.theHeist.view.provinces.ArtlinView;
import byui.cit260.theHeist.view.provinces.BouryView;
import byui.cit260.theHeist.view.provinces.CelnigView;
import byui.cit260.theHeist.view.provinces.DuvinView;
import byui.cit260.theHeist.view.provinces.EstripView;
import byui.cit260.theHeist.view.provinces.FarginView;
import byui.cit260.theHeist.view.provinces.GoverieView;
import byui.cit260.theHeist.view.provinces.HowertyView;
import byui.cit260.theHeist.view.provinces.InlinView;
import byui.cit260.theHeist.view.provinces.JawelView;
import byui.cit260.theHeist.view.provinces.KinteView;
import byui.cit260.theHeist.view.provinces.LerlyView;
import byui.cit260.theHeist.view.provinces.MurtanView;
import byui.cit260.theHeist.view.provinces.NolafeView;
import byui.cit260.theHeist.view.provinces.OpsteraView;
import byui.cit260.theHeist.view.provinces.ParquinView;
import byui.cit260.theHeist.view.provinces.RysterView;
import byui.cit260.theHeist.view.provinces.SwerlinView;
import byui.cit260.theHeist.view.provinces.TerwaltView;
import byui.cit260.theHeist.view.provinces.UrltinView;
import byui.cit260.theHeist.view.provinces.VerluView;
import byui.cit260.theHeist.view.provinces.WebelView;
import byui.cit260.theHeist.view.provinces.XinaView;
import byui.cit260.theHeist.view.provinces.YasterView;
import byui.cit260.theHeist.view.provinces.ZintaView;

import theheist.TheHeist;

/**
 *
 * @author luceromoreno
 */
public class MapMenuView extends View {

    private String menu;
    private String promptMessage;
    private int rowCount;
    private int columnCount;

    public MapMenuView() {
        super("\n"
                + "\n---------------------------"
                + "\n | Map Menu              |"
                + "\n---------------------------"
                + "\n A - Artlin                "
                + "\n B - Boury                 "
                + "\n C - Celnig                "
                + "\n D - Duvin                 "
                + "\n E - Estrip                "
                + "\n F - Fargin                "
                + "\n G - Goverie               "
                + "\n H - Howerty               "
                + "\n I - Inlin                 "
                + "\n J - Jawel                 "
                + "\n K - Kinte                 "
                + "\n L - Lerly                 "
                + "\n M - Murtan                "
                + "\n N - Nolafe                "
                + "\n O - Opstera               "
                + "\n P - Parquin               "
                + "\n R - Ryster                "
                + "\n S - Swerlin               "
                + "\n T - Terwalt               "
                + "\n U - Urtlin                "
                + "\n V - Verlu                 "
                + "\n W - Webel                 "
                + "\n X - Xina                  "
                + "\n Y - Yaster                "
                + "\n Z - Zinta                 "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "A":
                this.goArtlin();
                break;
            case "B":
                this.goBoury();
                break;
            case "C":
                this.goCelnig();
                break;
            case "D":
                this.goDuvin();
                break;
            case "E":
                this.goEstrip();
                break;
            case "F":
                this.goFargin();
                break;
            case "G":
                this.goGoverie();
                break;
            case "H":
                this.goHowerty();
                break;
            case "I":
                this.goInlin();
                break;
            case "J":
                this.goJawel();
                break;
            case "K":
                this.goKinte();
                break;
            case "L":
                this.goLerly();
                break;
            case "M":
                this.goMurtan();
                break;
            case "N":
                this.goNolafe();
                break;
            case "O":
                this.goOpstera();
                break;
            case "P":
                this.goParquin();
                break;
            case "R":
                this.goRyster();
                break;
            case "S":
                this.goSwerlin();
                break;
            case "T":
                this.goTerwalt();
                break;
            case "U":
                this.goUrltin();
                break;
            case "V":
                this.goVerlu();
                break;
            case "W":
                this.goWebel();
                break;
            case "X":
                this.goXina();
                break;
            case "Y":
                this.goYaster();
                break;
            case "Z":
                this.goZinta();
                break;
            default:
                ErrorView.display("MapMenuView", "*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void goArtlin() {
        ArtlinView artlinView = new ArtlinView();
        artlinView.display();
    }

    private void goBoury() {
        BouryView bouryView = new BouryView();
        bouryView.display();
    }

    private void goCelnig() {
        CelnigView celnigView = new CelnigView();
        celnigView.display();
    }

    private void goDuvin() {
        DuvinView duvinView = new DuvinView();
        duvinView.display();
    }

    private void goEstrip() {
        EstripView estripView = new EstripView();
        estripView.display();
    }

    private void goFargin() {
        FarginView farginView = new FarginView();
        farginView.display();
    }

    private void goGoverie() {
        GoverieView goverieView = new GoverieView();
        goverieView.display();
    }

    private void goHowerty() {
        HowertyView howertyView = new HowertyView();
        howertyView.display();
    }

    private void goInlin() {
        InlinView inlinView = new InlinView();
        inlinView.display();
    }

    private void goJawel() {
        JawelView jawelView = new JawelView();
        jawelView.display();
    }

    private void goKinte() {
        KinteView kinteView = new KinteView();
        kinteView.display();
    }

    private void goLerly() {
        LerlyView lerlyView = new LerlyView();
        lerlyView.display();
    }

    private void goMurtan() {
        MurtanView murtanView = new MurtanView();
        murtanView.display();
    }

    private void goNolafe() {
        NolafeView nolafeView = new NolafeView();
        nolafeView.display();
    }

    private void goOpstera() {
        OpsteraView opsteraView = new OpsteraView();
        opsteraView.display();
    }

    private void goParquin() {
        ParquinView parquinView = new ParquinView();
        parquinView.display();
    }

    private void goRyster() {
        RysterView rysterView = new RysterView();
        rysterView.display();
    }

    private void goSwerlin() {
        SwerlinView swerlinView = new SwerlinView();
        swerlinView.display();
    }

    private void goTerwalt() {
        TerwaltView terwaltView = new TerwaltView();
        terwaltView.display();
    }

    private void goUrltin() {
        UrltinView urltinView = new UrltinView();
        urltinView.display();
    }

    private void goVerlu() {
        VerluView verluView = new VerluView();
        verluView.display();
    }

    private void goWebel() {
        WebelView webelView = new WebelView();
        webelView.display();
    }

    private void goXina() {
        XinaView xinaView = new XinaView();
        xinaView.display();
    }

    private void goYaster() {
        YasterView yasterView = new YasterView();
        yasterView.display();
    }

    private void goZinta() {
        ZintaView zintaView = new ZintaView();
        zintaView.display();
    }

    private void displayMap() {

        Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();

        int rowCount = TheHeist.getCurrentGame().getMap().getNoOfRows();
        int columnCount = TheHeist.getCurrentGame().getMap().getNoOfColumns();

        this.console.println("\nTitle");

        for (int row = 0; row < rowCount; row++) {
            this.console.println("-");
            this.console.println(row);

            for (int column = 0; column < columnCount; column++) {
                this.console.println("|");
                this.console.println(column);

                if (locations[row][column].getVisited()) {
                    this.console.println("mapSymbol");
                } else {
                    this.console.println("??");
                }

                this.console.println("|");
            }
            this.console.println("-");
        }

    }

}
