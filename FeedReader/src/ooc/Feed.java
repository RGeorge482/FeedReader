/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author 35386
 */
public class Feed implements FeedInterface {
   ArrayList<FeedItem>items;

    public Feed() {
        items = new ArrayList<>();
    }
    
     /**
     * This method add a new FeedItem into the Feed
     *
     * @param item -New Feed item
     */
    @Override
    public void addItem(FeedItem item){
        items.add(item);
    }
    
}
