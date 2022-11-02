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
    
<<<<<<< HEAD
      /**
     * This method returns a collection of the titles of all the items in the
     * feed.
     *
     * @return a list of titles of all the items in the feed.
     */
    @Override
    public Collection<String> listTitles(){
        ArrayList<String> titles = new ArrayList<>();

        for(FeedItem item : items) {
            titles.add(item.getTitle());
        }
        return titles;
    }
    
    
    
=======
        /**
     * This method returns the FeedItem with the given title, or null if no item
     * has the given title. You can assume that no two items will have the same
     * title
     *
     * @param title the title of the item to find.
     * @return the FeedItem with the given title or null if no item has the
     * given title.
     */
    @Override
    public FeedItem getItem(String title){
        for(FeedItem item : items) {
            if(item.getTitle().equalsIgnoreCase(title)) {
                return item; // item.getContent();
            }
        }
        return null;
    }
    
>>>>>>> Third-branch
}
