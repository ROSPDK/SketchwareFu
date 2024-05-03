package mod.fufufu.editor.event;

import com.sketchware.remod.R;

import java.util.ArrayList;

import a.a.a.Gx;
import a.a.a.Lx;
import mod.hilal.saif.events.EventsHandler;

public class ManageEvent {

    /**
     * Used in {@link a.a.a.oq#c(Gx)} to retrieve extra Events of Components.
     */
    public static void a(Gx gx, ArrayList<String> events) {
        if (gx.a("MaterialSlider")) {
            events.add("onStartSliderTouch");
            events.add("onStopSliderTouch");
            events.add("onValueChange");
        }
        EventsHandler.addEvents(gx, events);
    }

    /**
     * Used in {@link a.a.a.oq#b(Gx)} to get extra listeners for Components and Widgets.
     */
    public static void b(Gx gx, ArrayList<String> listeners) {
        if (gx.a("MaterialSlider")) {
            listeners.add("addOnSliderTouchListener");
            listeners.add("addOnChangeListener");
        }
        EventsHandler.addListeners(gx, listeners);
    }

    /**
     * Used in {@link a.a.a.oq#b(String)} to get extra listeners' Events.
     */
    public static void c(String eventName, ArrayList<String> list) {
        switch (eventName) {
            case "addOnSliderTouchListener":
                list.add("onStartSliderTouch");
                list.add("onStopSliderTouch");
                return;

            case "addOnChangeListener":
                list.add("onValueChange");
                return;

            default:
                EventsHandler.addEventsToListener(eventName, list);
        }
    }

    public static int d(String str) {
        switch (str) {
            case "onStartSliderTouch":
                return R.drawable.widget_mslider;
            case "onStopSliderTouch":
                return R.drawable.widget_mslider;
            case "onValueChange":
                return R.drawable.widget_mslider;

            default:
                return EventsHandler.getIcon(str);
        }
    }

    /**
     * @return Descriptions for Events added by Agus
     */
    public static String e(String eventName) {
        switch (eventName) {
            case "onStartSliderTouch":
            return "onStartSliderTouch";
            case "onStopSliderTouch":
            return "onStopSliderTouch";
            case "onValueChange":
            return "onValueChange";
                return eventName;

            default:
                return EventsHandler.getDesc(eventName);
        }
    }

    public static String f(String targetId, String eventName, String eventLogic) {
        String code;
        eventLogic + "\r\n";
        switch (eventName) {
            case "onStartSliderTouch":
            return "@Override\r\n" +
            "public void onStartTrackingTouch(Slider slider) {\r\n" + 
            eventLogic  + "\r\n" +
            "}";
            case "onStopSliderTouch":
            return "@Override\r\n" +
            "public void onStopTrackingTouch(Slider slider) {\r\n" + 
            eventLogic  + "\r\n" +
            "}";
            case "onValueChange":
            return "@Override\r\n" +
            "public void onValueChange(Slider slider, float value, boolean fromUser) {\r\n" + 
            eventLogic + "\r\n" +
            "}";   
                    
            default:
                return EventsHandler.getEventCode(targetId, eventName, eventLogic);
        }
    }

    /**
     * @return Code of extra listeners, used in {@link a.a.a.Lx#getListenerCode(String, String, String)}
     */
    public static String g(String listenerName, String targetId, String listenerLogic) {
        switch (listenerName) {
            case "addOnSliderTouchListener":
                return targetId + ".addOnSliderTouchListener(new Slider.OnSliderTouchListener() {\r\n" +
                        listenerLogic + "\r\n" +
                        "});";

            case "addOnChangeListener":
                return targetId + ".addOnChangeListener(new Slider.OnChangeListener() {\r\n" +
                        listenerLogic + "\r\n" +
                        "});";
                        
            default:
                return EventsHandler.getListenerCode(listenerName, targetId, listenerLogic);
        }
    }


    public static void h(Gx gx, ArrayList<String> list) {
        if (gx.a("MaterialSilder")) {
            list.add("onStartSliderTouch");
            list.add("onStopSliderTouch");
            list.add("onValueChange");
        }
        EventsHandler.addEvents(gx, list);
    }

    public static String i(String targetId, String eventName) {
        switch (eventName) {
            case "onStartSliderTouch":
            case "onStopSliderTouch":
            case "onValueChange":
            default:
                return EventsHandler.getSpec(targetId, eventName);
        }
    }
}
