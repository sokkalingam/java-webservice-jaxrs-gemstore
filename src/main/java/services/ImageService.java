package services;

import java.util.List;
import java.util.Map;

import models.Image;

public class ImageService {
	
	private GemService gemService = new GemService();

	public List<Image> getImages(Integer gemId) {
		if (gemService.isGemPresent(gemId))
			return gemService.getGem(gemId).getImages();
		return null;
	}

	public Image getImage(Integer gemId, Integer imageId) {
		if (gemId == null || imageId == null)
			return null;
		Map<Integer, Image> ImageMap = getImageMap(gemId);
		if (ImageMap == null)
			return null;
		return ImageMap.get(imageId);
	}

	public Image addImage(Integer gemId, Image image) {
		if (gemId == null || image == null)
			return null;
		List<Image> images = getImages(gemId);
		if (images == null)
			return null;
		image.setId(images.size() + 1);
		images.add(image);
		return image;
	}

	public Image updateImage(Integer gemId, Integer imageId, Image image) {
		if (gemId == null || imageId == null || image == null)
			return null;
		Map<Integer, Image> ImageMap = getImageMap(gemId);
		if (ImageMap != null && ImageMap.containsKey(imageId)) {
			image.setId(imageId);
			return ImageMap.put(imageId, image);
		}
		return null;
	}

	public Image deleteImage(Integer gemId, Integer imageId) {
		if (gemId == null || imageId == null)
			return null;
		Map<Integer, Image> ImageMap = getImageMap(gemId);
		if (ImageMap == null)
			return null;
		return ImageMap.remove(imageId);
	}

	public Map<Integer, Image> getImageMap(Integer gemId) {
		if (gemService.isGemPresent(gemId))
			return gemService.getGem(gemId).getImagesMap();
		return null;
	}

}
