package by.devilmice.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "notebooks", schema = "project", catalog = "")
public class NotebookEntity {
    private int id;
    private String title;
    private int releaseDate;
    private String type;
    private String assigned;
    private String platform;
    private String processor;
    private String processorModel;
    private int countCores;
    private int clockFrequency;
    private int turboFrequency;
    private int tdp;
    private String bgp;
    private String bodyMaterial;
    private String bodyColor;
    private String coverMaterial;
    private String coverColor;
    private String resistance;
    private double width;
    private double depth;
    private double thickness;
    private double weight;
    private double screenDiagonal;
    private String screenResolution;
    private int screenFrequency;
    private String screenTechnology;
    private String screenSurface;
    private String touchScreen;
    private String ramType;
    private int ramFrequency;
    private int capacityRam;
    private int maxCapacityRam;
    private int countSlotRam;
    private String typeDrive;
    private int capacitydrivehdd;
    private int capacitydrivessd;
    private String odd;
    private String cardSlot;
    private String discreteGraphics;
    private String nameGraphics;
    private int capacityVideoMemory;
    private String builtCamera;
    private double cameraPixels;
    private String builtMic;
    private String builtSound;
    private String numpad;
    private String keypboardIllum;
    private String cyrillicKeys;
    private String cursorControl;
    private String fingerScanner;
    private String simCard;
    private String nfc;
    private String bt;
    private String lan;
    private String wifi;
    private int countUsb;
    private int usb20;
    private int usb30;
    private int usb31Typea;
    private int usb31Typec;
    private String vga;
    private String hdmi;
    private String displayport;
    private String thunderbolt;
    private String audioIn;
    private int countCell;
    private int energyReserv;
    private String os;
    private String deliverySet;
    private int price;
    private String vendor;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Basic
    @Column(name = "vendor")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }


    @Basic
    @Column(name = "release_date")
    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "assigned")
    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    @Basic
    @Column(name = "platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Basic
    @Column(name = "processor")
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Basic
    @Column(name = "processor_model")
    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    @Basic
    @Column(name = "count_cores")
    public int getCountCores() {
        return countCores;
    }

    public void setCountCores(int countCores) {
        this.countCores = countCores;
    }

    @Basic
    @Column(name = "clock_frequency")
    public int getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(int clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    @Basic
    @Column(name = "turbo_frequency")
    public int getTurboFrequency() {
        return turboFrequency;
    }

    public void setTurboFrequency(int turboFrequency) {
        this.turboFrequency = turboFrequency;
    }

    @Basic
    @Column(name = "tdp")
    public int getTdp() {
        return tdp;
    }

    public void setTdp(int tdp) {
        this.tdp = tdp;
    }

    @Basic
    @Column(name = "bgp")
    public String getBgp() {
        return bgp;
    }

    public void setBgp(String bgp) {
        this.bgp = bgp;
    }

    @Basic
    @Column(name = "body_material")
    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    @Basic
    @Column(name = "body_color")
    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    @Basic
    @Column(name = "cover_material")
    public String getCoverMaterial() {
        return coverMaterial;
    }

    public void setCoverMaterial(String coverMaterial) {
        this.coverMaterial = coverMaterial;
    }

    @Basic
    @Column(name = "cover_color")
    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    @Basic
    @Column(name = "resistance")
    public String getResistance() {
        return resistance;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    @Basic
    @Column(name = "width")
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Basic
    @Column(name = "depth")
    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Basic
    @Column(name = "thickness")
    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Basic
    @Column(name = "weight")
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "screen_diagonal")
    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Basic
    @Column(name = "screen_resolution")
    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Basic
    @Column(name = "screen_frequency")
    public int getScreenFrequency() {
        return screenFrequency;
    }

    public void setScreenFrequency(int screenFrequency) {
        this.screenFrequency = screenFrequency;
    }

    @Basic
    @Column(name = "screen_technology")
    public String getScreenTechnology() {
        return screenTechnology;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    @Basic
    @Column(name = "screen_surface")
    public String getScreenSurface() {
        return screenSurface;
    }

    public void setScreenSurface(String screenSurface) {
        this.screenSurface = screenSurface;
    }

    @Basic
    @Column(name = "touch_screen")
    public String getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(String touchScreen) {
        this.touchScreen = touchScreen;
    }

    @Basic
    @Column(name = "ram_type")
    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    @Basic
    @Column(name = "ram_frequency")
    public int getRamFrequency() {
        return ramFrequency;
    }

    public void setRamFrequency(int ramFrequency) {
        this.ramFrequency = ramFrequency;
    }

    @Basic
    @Column(name = "capacity_ram")
    public int getCapacityRam() {
        return capacityRam;
    }

    public void setCapacityRam(int capacityRam) {
        this.capacityRam = capacityRam;
    }

    @Basic
    @Column(name = "max_capacity_ram")
    public int getMaxCapacityRam() {
        return maxCapacityRam;
    }

    public void setMaxCapacityRam(int maxCapacityRam) {
        this.maxCapacityRam = maxCapacityRam;
    }

    @Basic
    @Column(name = "count_slot_ram")
    public int getCountSlotRam() {
        return countSlotRam;
    }

    public void setCountSlotRam(int countSlotRam) {
        this.countSlotRam = countSlotRam;
    }

    @Basic
    @Column(name = "type_drive")
    public String getTypeDrive() {
        return typeDrive;
    }

    public void setTypeDrive(String typeDrive) {
        this.typeDrive = typeDrive;
    }

    @Basic
    @Column(name = "capacitydrivehdd")
    public int getCapacitydrivehdd() {
        return capacitydrivehdd;
    }

    public void setCapacitydrivehdd(int capacitydrivehdd) {
        this.capacitydrivehdd = capacitydrivehdd;
    }

    @Basic
    @Column(name = "capacitydrivessd")
    public int getCapacitydrivessd() {
        return capacitydrivessd;
    }

    public void setCapacitydrivessd(int capacitydrivessd) {
        this.capacitydrivessd = capacitydrivessd;
    }

    @Basic
    @Column(name = "odd")
    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    @Basic
    @Column(name = "card_slot")
    public String getCardSlot() {
        return cardSlot;
    }

    public void setCardSlot(String cardSlot) {
        this.cardSlot = cardSlot;
    }

    @Basic
    @Column(name = "discrete_graphics")
    public String getDiscreteGraphics() {
        return discreteGraphics;
    }

    public void setDiscreteGraphics(String discreteGraphics) {
        this.discreteGraphics = discreteGraphics;
    }

    @Basic
    @Column(name = "name_graphics")
    public String getNameGraphics() {
        return nameGraphics;
    }

    public void setNameGraphics(String nameGraphics) {
        this.nameGraphics = nameGraphics;
    }

    @Basic
    @Column(name = "capacity_video_memory")
    public int getCapacityVideoMemory() {
        return capacityVideoMemory;
    }

    public void setCapacityVideoMemory(int capacityVideoMemory) {
        this.capacityVideoMemory = capacityVideoMemory;
    }

    @Basic
    @Column(name = "built_camera")
    public String getBuiltCamera() {
        return builtCamera;
    }

    public void setBuiltCamera(String builtCamera) {
        this.builtCamera = builtCamera;
    }

    @Basic
    @Column(name = "camera_pixels")
    public double getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(double cameraPixels) {
        this.cameraPixels = cameraPixels;
    }

    @Basic
    @Column(name = "built_mic")
    public String getBuiltMic() {
        return builtMic;
    }

    public void setBuiltMic(String builtMic) {
        this.builtMic = builtMic;
    }

    @Basic
    @Column(name = "built_sound")
    public String getBuiltSound() {
        return builtSound;
    }

    public void setBuiltSound(String builtSound) {
        this.builtSound = builtSound;
    }

    @Basic
    @Column(name = "numpad")
    public String getNumpad() {
        return numpad;
    }

    public void setNumpad(String numpad) {
        this.numpad = numpad;
    }

    @Basic
    @Column(name = "keypboard_illum")
    public String getKeypboardIllum() {
        return keypboardIllum;
    }

    public void setKeypboardIllum(String keypboardIllum) {
        this.keypboardIllum = keypboardIllum;
    }

    @Basic
    @Column(name = "cyrillic_keys")
    public String getCyrillicKeys() {
        return cyrillicKeys;
    }

    public void setCyrillicKeys(String cyrillicKeys) {
        this.cyrillicKeys = cyrillicKeys;
    }

    @Basic
    @Column(name = "cursor_control")
    public String getCursorControl() {
        return cursorControl;
    }

    public void setCursorControl(String cursorControl) {
        this.cursorControl = cursorControl;
    }

    @Basic
    @Column(name = "finger_scanner")
    public String getFingerScanner() {
        return fingerScanner;
    }

    public void setFingerScanner(String fingerScanner) {
        this.fingerScanner = fingerScanner;
    }

    @Basic
    @Column(name = "sim_card")
    public String getSimCard() {
        return simCard;
    }

    public void setSimCard(String simCard) {
        this.simCard = simCard;
    }

    @Basic
    @Column(name = "nfc")
    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    @Basic
    @Column(name = "bt")
    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    @Basic
    @Column(name = "lan")
    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    @Basic
    @Column(name = "wifi")
    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    @Basic
    @Column(name = "count_usb")
    public int getCountUsb() {
        return countUsb;
    }

    public void setCountUsb(int countUsb) {
        this.countUsb = countUsb;
    }

    @Basic
    @Column(name = "usb20")
    public int getUsb20() {
        return usb20;
    }

    public void setUsb20(int usb20) {
        this.usb20 = usb20;
    }

    @Basic
    @Column(name = "usb30")
    public int getUsb30() {
        return usb30;
    }

    public void setUsb30(int usb30) {
        this.usb30 = usb30;
    }

    @Basic
    @Column(name = "usb31_typea")
    public int getUsb31Typea() {
        return usb31Typea;
    }

    public void setUsb31Typea(int usb31Typea) {
        this.usb31Typea = usb31Typea;
    }

    @Basic
    @Column(name = "usb31_typec")
    public int getUsb31Typec() {
        return usb31Typec;
    }

    public void setUsb31Typec(int usb31Typec) {
        this.usb31Typec = usb31Typec;
    }

    @Basic
    @Column(name = "vga")
    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    @Basic
    @Column(name = "hdmi")
    public String getHdmi() {
        return hdmi;
    }

    public void setHdmi(String hdmi) {
        this.hdmi = hdmi;
    }

    @Basic
    @Column(name = "displayport")
    public String getDisplayport() {
        return displayport;
    }

    public void setDisplayport(String displayport) {
        this.displayport = displayport;
    }

    @Basic
    @Column(name = "thunderbolt")
    public String getThunderbolt() {
        return thunderbolt;
    }

    public void setThunderbolt(String thunderbolt) {
        this.thunderbolt = thunderbolt;
    }

    @Basic
    @Column(name = "audio_in")
    public String getAudioIn() {
        return audioIn;
    }

    public void setAudioIn(String audioIn) {
        this.audioIn = audioIn;
    }

    @Basic
    @Column(name = "count_cell")
    public int getCountCell() {
        return countCell;
    }

    public void setCountCell(int countCell) {
        this.countCell = countCell;
    }

    @Basic
    @Column(name = "energy_reserv")
    public int getEnergyReserv() {
        return energyReserv;
    }

    public void setEnergyReserv(int energyReserv) {
        this.energyReserv = energyReserv;
    }

    @Basic
    @Column(name = "os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Basic
    @Column(name = "delivery_set")
    public String getDeliverySet() {
        return deliverySet;
    }

    public void setDeliverySet(String deliverySet) {
        this.deliverySet = deliverySet;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    private List<NotebookImagesEntity> notebookImagesList = new ArrayList<NotebookImagesEntity>();



    @OneToMany(fetch=FetchType.EAGER, mappedBy = "notebookEntity", cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    public List<NotebookImagesEntity> getNotebookImagesList() {
        return notebookImagesList;
    }

    public void setNotebookImagesList(List<NotebookImagesEntity> notebookImagesList) {
        this.notebookImagesList = notebookImagesList;
    }


    private List<OrdersEntity> orderList;
    @OneToMany(fetch=FetchType.EAGER ,cascade = CascadeType.ALL, mappedBy = "notebookEntity")
    @Fetch(value = FetchMode.SUBSELECT)
    public List<OrdersEntity> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrdersEntity> orderList) {
        this.orderList = orderList;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotebookEntity that = (NotebookEntity) o;

        if (id != that.id) return false;
        if (releaseDate != that.releaseDate) return false;
        if (countCores != that.countCores) return false;
        if (clockFrequency != that.clockFrequency) return false;
        if (turboFrequency != that.turboFrequency) return false;
        if (tdp != that.tdp) return false;
        if (Double.compare(that.width, width) != 0) return false;
        if (Double.compare(that.depth, depth) != 0) return false;
        if (Double.compare(that.thickness, thickness) != 0) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.screenDiagonal, screenDiagonal) != 0) return false;
        if (screenFrequency != that.screenFrequency) return false;
        if (ramFrequency != that.ramFrequency) return false;
        if (capacityRam != that.capacityRam) return false;
        if (maxCapacityRam != that.maxCapacityRam) return false;
        if (countSlotRam != that.countSlotRam) return false;
        if (capacitydrivehdd != that.capacitydrivehdd) return false;
        if (capacitydrivessd != that.capacitydrivessd) return false;
        if (capacityVideoMemory != that.capacityVideoMemory) return false;
        if (Double.compare(that.cameraPixels, cameraPixels) != 0) return false;
        if (countUsb != that.countUsb) return false;
        if (usb20 != that.usb20) return false;
        if (usb30 != that.usb30) return false;
        if (usb31Typea != that.usb31Typea) return false;
        if (usb31Typec != that.usb31Typec) return false;
        if (countCell != that.countCell) return false;
        if (energyReserv != that.energyReserv) return false;
        if (price != that.price) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (assigned != null ? !assigned.equals(that.assigned) : that.assigned != null) return false;
        if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
        if (processor != null ? !processor.equals(that.processor) : that.processor != null) return false;
        if (processorModel != null ? !processorModel.equals(that.processorModel) : that.processorModel != null)
            return false;
        if (bgp != null ? !bgp.equals(that.bgp) : that.bgp != null) return false;
        if (bodyMaterial != null ? !bodyMaterial.equals(that.bodyMaterial) : that.bodyMaterial != null) return false;
        if (bodyColor != null ? !bodyColor.equals(that.bodyColor) : that.bodyColor != null) return false;
        if (coverMaterial != null ? !coverMaterial.equals(that.coverMaterial) : that.coverMaterial != null)
            return false;
        if (coverColor != null ? !coverColor.equals(that.coverColor) : that.coverColor != null) return false;
        if (resistance != null ? !resistance.equals(that.resistance) : that.resistance != null) return false;
        if (screenResolution != null ? !screenResolution.equals(that.screenResolution) : that.screenResolution != null)
            return false;
        if (screenTechnology != null ? !screenTechnology.equals(that.screenTechnology) : that.screenTechnology != null)
            return false;
        if (screenSurface != null ? !screenSurface.equals(that.screenSurface) : that.screenSurface != null)
            return false;
        if (touchScreen != null ? !touchScreen.equals(that.touchScreen) : that.touchScreen != null) return false;
        if (ramType != null ? !ramType.equals(that.ramType) : that.ramType != null) return false;
        if (typeDrive != null ? !typeDrive.equals(that.typeDrive) : that.typeDrive != null) return false;
        if (odd != null ? !odd.equals(that.odd) : that.odd != null) return false;
        if (cardSlot != null ? !cardSlot.equals(that.cardSlot) : that.cardSlot != null) return false;
        if (discreteGraphics != null ? !discreteGraphics.equals(that.discreteGraphics) : that.discreteGraphics != null)
            return false;
        if (nameGraphics != null ? !nameGraphics.equals(that.nameGraphics) : that.nameGraphics != null) return false;
        if (builtCamera != null ? !builtCamera.equals(that.builtCamera) : that.builtCamera != null) return false;
        if (builtMic != null ? !builtMic.equals(that.builtMic) : that.builtMic != null) return false;
        if (builtSound != null ? !builtSound.equals(that.builtSound) : that.builtSound != null) return false;
        if (numpad != null ? !numpad.equals(that.numpad) : that.numpad != null) return false;
        if (keypboardIllum != null ? !keypboardIllum.equals(that.keypboardIllum) : that.keypboardIllum != null)
            return false;
        if (cyrillicKeys != null ? !cyrillicKeys.equals(that.cyrillicKeys) : that.cyrillicKeys != null) return false;
        if (cursorControl != null ? !cursorControl.equals(that.cursorControl) : that.cursorControl != null)
            return false;
        if (fingerScanner != null ? !fingerScanner.equals(that.fingerScanner) : that.fingerScanner != null)
            return false;
        if (simCard != null ? !simCard.equals(that.simCard) : that.simCard != null) return false;
        if (nfc != null ? !nfc.equals(that.nfc) : that.nfc != null) return false;
        if (bt != null ? !bt.equals(that.bt) : that.bt != null) return false;
        if (lan != null ? !lan.equals(that.lan) : that.lan != null) return false;
        if (wifi != null ? !wifi.equals(that.wifi) : that.wifi != null) return false;
        if (vga != null ? !vga.equals(that.vga) : that.vga != null) return false;
        if (hdmi != null ? !hdmi.equals(that.hdmi) : that.hdmi != null) return false;
        if (displayport != null ? !displayport.equals(that.displayport) : that.displayport != null) return false;
        if (thunderbolt != null ? !thunderbolt.equals(that.thunderbolt) : that.thunderbolt != null) return false;
        if (audioIn != null ? !audioIn.equals(that.audioIn) : that.audioIn != null) return false;
        if (os != null ? !os.equals(that.os) : that.os != null) return false;
        if (deliverySet != null ? !deliverySet.equals(that.deliverySet) : that.deliverySet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + releaseDate;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (assigned != null ? assigned.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (processor != null ? processor.hashCode() : 0);
        result = 31 * result + (processorModel != null ? processorModel.hashCode() : 0);
        result = 31 * result + countCores;
        result = 31 * result + clockFrequency;
        result = 31 * result + turboFrequency;
        result = 31 * result + tdp;
        result = 31 * result + (bgp != null ? bgp.hashCode() : 0);
        result = 31 * result + (bodyMaterial != null ? bodyMaterial.hashCode() : 0);
        result = 31 * result + (bodyColor != null ? bodyColor.hashCode() : 0);
        result = 31 * result + (coverMaterial != null ? coverMaterial.hashCode() : 0);
        result = 31 * result + (coverColor != null ? coverColor.hashCode() : 0);
        result = 31 * result + (resistance != null ? resistance.hashCode() : 0);
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(thickness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(screenDiagonal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (screenResolution != null ? screenResolution.hashCode() : 0);
        result = 31 * result + screenFrequency;
        result = 31 * result + (screenTechnology != null ? screenTechnology.hashCode() : 0);
        result = 31 * result + (screenSurface != null ? screenSurface.hashCode() : 0);
        result = 31 * result + (touchScreen != null ? touchScreen.hashCode() : 0);
        result = 31 * result + (ramType != null ? ramType.hashCode() : 0);
        result = 31 * result + ramFrequency;
        result = 31 * result + capacityRam;
        result = 31 * result + maxCapacityRam;
        result = 31 * result + countSlotRam;
        result = 31 * result + (typeDrive != null ? typeDrive.hashCode() : 0);
        result = 31 * result + capacitydrivehdd;
        result = 31 * result + capacitydrivessd;
        result = 31 * result + (odd != null ? odd.hashCode() : 0);
        result = 31 * result + (cardSlot != null ? cardSlot.hashCode() : 0);
        result = 31 * result + (discreteGraphics != null ? discreteGraphics.hashCode() : 0);
        result = 31 * result + (nameGraphics != null ? nameGraphics.hashCode() : 0);
        result = 31 * result + capacityVideoMemory;
        result = 31 * result + (builtCamera != null ? builtCamera.hashCode() : 0);
        temp = Double.doubleToLongBits(cameraPixels);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (builtMic != null ? builtMic.hashCode() : 0);
        result = 31 * result + (builtSound != null ? builtSound.hashCode() : 0);
        result = 31 * result + (numpad != null ? numpad.hashCode() : 0);
        result = 31 * result + (keypboardIllum != null ? keypboardIllum.hashCode() : 0);
        result = 31 * result + (cyrillicKeys != null ? cyrillicKeys.hashCode() : 0);
        result = 31 * result + (cursorControl != null ? cursorControl.hashCode() : 0);
        result = 31 * result + (fingerScanner != null ? fingerScanner.hashCode() : 0);
        result = 31 * result + (simCard != null ? simCard.hashCode() : 0);
        result = 31 * result + (nfc != null ? nfc.hashCode() : 0);
        result = 31 * result + (bt != null ? bt.hashCode() : 0);
        result = 31 * result + (lan != null ? lan.hashCode() : 0);
        result = 31 * result + (wifi != null ? wifi.hashCode() : 0);
        result = 31 * result + countUsb;
        result = 31 * result + usb20;
        result = 31 * result + usb30;
        result = 31 * result + usb31Typea;
        result = 31 * result + usb31Typec;
        result = 31 * result + (vga != null ? vga.hashCode() : 0);
        result = 31 * result + (hdmi != null ? hdmi.hashCode() : 0);
        result = 31 * result + (displayport != null ? displayport.hashCode() : 0);
        result = 31 * result + (thunderbolt != null ? thunderbolt.hashCode() : 0);
        result = 31 * result + (audioIn != null ? audioIn.hashCode() : 0);
        result = 31 * result + countCell;
        result = 31 * result + energyReserv;
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + (deliverySet != null ? deliverySet.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }



}
