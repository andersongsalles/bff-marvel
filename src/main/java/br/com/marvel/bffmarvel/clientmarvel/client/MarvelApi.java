package br.com.marvel.bffmarvel.clientmarvel.client;

import br.com.marvel.bffmarvel.clientmarvel.model.*;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.math.BigDecimal;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-11-11T22:48:12.266406300-03:00[America/Sao_Paulo]")
@Validated
@Api(value = "Default")
public interface MarvelApi {

	@ApiOperation(value = "Character by Id", nickname = "characterById", notes = "Fetches a single character by id.", response = CharacterDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CharacterDataWrapper.class) })
	@GetMapping(value = "/characters/{characterId}", produces = "*/*")
	ResponseEntity<CharacterDataWrapper> characterById(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "A single character id.", required = true) @PathVariable("characterId") String characterId);

	@ApiOperation(value = "Character comics", nickname = "characterComics", notes = "Fetches lists of comics filtered by a character id.", response = ComicDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ComicDataWrapper.class) })
	@GetMapping(value = "/characters/{characterId}/comics", produces = "*/*")
	ResponseEntity<ComicDataWrapper> characterComics(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The character id.", required = true) @PathVariable("characterId") String characterId,
			@ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).") @Valid @RequestParam(value = "format", required = false) String format,
			@ApiParam(value = "Filter by the issue format type (comic or collection).") @Valid @RequestParam(value = "formatType", required = false) String formatType,
			@ApiParam(value = "Exclude variant comics from the result set.") @Valid @RequestParam(value = "noVariants", required = false) Boolean noVariants,
			@ApiParam(value = "Return comics within a predefined date range.") @Valid @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
			@ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @Valid @RequestParam(value = "dateRange", required = false) BigDecimal dateRange,
			@ApiParam(value = "Filter by diamond code.") @Valid @RequestParam(value = "diamondCode", required = false) String diamondCode,
			@ApiParam(value = "Filter by digital comic id.") @Valid @RequestParam(value = "digitalId", required = false) BigDecimal digitalId,
			@ApiParam(value = "Filter by UPC.") @Valid @RequestParam(value = "upc", required = false) String upc,
			@ApiParam(value = "Filter by ISBN.") @Valid @RequestParam(value = "isbn", required = false) String isbn,
			@ApiParam(value = "Filter by EAN.") @Valid @RequestParam(value = "ean", required = false) String ean,
			@ApiParam(value = "Filter by ISSN.") @Valid @RequestParam(value = "issn", required = false) String issn,
			@ApiParam(value = "Include only results which are available digitally.") @Valid @RequestParam(value = "hasDigitalIssue", required = false) Boolean hasDigitalIssue,
			@ApiParam(value = "Return only comics which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @Valid @RequestParam(value = "sharedAppearances", required = false) BigDecimal sharedAppearances,
			@ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @Valid @RequestParam(value = "collaborators", required = false) BigDecimal collaborators,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Character events", nickname = "characterEvents", notes = "Fetches lists of events filtered by a character id.", response = EventDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = EventDataWrapper.class) })
	@GetMapping(value = "/characters/{characterId}/events", produces = "*/*")
	ResponseEntity<EventDataWrapper> characterEvents(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The character ID.", required = true) @PathVariable("characterId") String characterId,
			@ApiParam(value = "Filter the event list by name.") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only events which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Character series", nickname = "characterSeries", notes = "Fetches lists of series filtered by a character id.", response = SeriesDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = SeriesDataWrapper.class) })
	@GetMapping(value = "/characters/{characterId}/series", produces = "*/*")
	ResponseEntity<SeriesDataWrapper> characterSeries(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The character ID", required = true) @PathVariable("characterId") String characterId,
			@ApiParam(value = "Filter by series title.") @Valid @RequestParam(value = "title", required = false) String title,
			@ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
			@ApiParam(value = "Return only series matching the specified start year.") @Valid @RequestParam(value = "startYear", required = false) BigDecimal startYear,
			@ApiParam(value = "Return only series which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only series which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only series which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Filter the series by publication frequency type.") @Valid @RequestParam(value = "seriesType", required = false) String seriesType,
			@ApiParam(value = "Return only series containing one or more comics with the specified format.") @Valid @RequestParam(value = "contains", required = false) String contains,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Character stories", nickname = "characterStories", notes = "Fetches lists of stories filtered by a character id.", response = StoryDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StoryDataWrapper.class) })
	@GetMapping(value = "/characters/{characterId}/stories", produces = "*/*")
	ResponseEntity<StoryDataWrapper> characterStories(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The character ID.", required = true) @PathVariable("characterId") String characterId,
			@ApiParam(value = "Return only stories which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Comic by Id", nickname = "comicById", notes = "Fetches a single comic by id.", response = ComicDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ComicDataWrapper.class) })
	@GetMapping(value = "/comics/{comicId}", produces = "*/*")
	ResponseEntity<ComicDataWrapper> comicById(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "A single comic.", required = true) @PathVariable("comicId") String comicId);

	@ApiOperation(value = "Comic characters", nickname = "comicCharacters", notes = "Fetches lists of characters filtered by a comic id.", response = CharacterDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CharacterDataWrapper.class) })
	@GetMapping(value = "/comics/{comicId}/characters", produces = "*/*")
	ResponseEntity<CharacterDataWrapper> comicCharacters(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The comic id.", required = true) @PathVariable("comicId") String comicId,
			@ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only characters which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Comic creators", nickname = "comicCreators", notes = "Fetches lists of creators filtered by a comic id.", response = CreatorDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CreatorDataWrapper.class) })
	@GetMapping(value = "/comics/{comicId}/creators", produces = "*/*")
	ResponseEntity<CreatorDataWrapper> comicCreators(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The comic id.", required = true) @PathVariable("comicId") String comicId,
			@ApiParam(value = "Filter by creator first name (e.g. brian).") @Valid @RequestParam(value = "firstName", required = false) String firstName,
			@ApiParam(value = "Filter by creator middle name (e.g. Michael).") @Valid @RequestParam(value = "middleName", required = false) String middleName,
			@ApiParam(value = "Filter by creator last name (e.g. Bendis).") @Valid @RequestParam(value = "lastName", required = false) String lastName,
			@ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @Valid @RequestParam(value = "suffix", required = false) String suffix,
			@ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
			@ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @Valid @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
			@ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @Valid @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
			@ApiParam(value = "Return only creators which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only creators who worked on the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only creators who worked on the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Comic events", nickname = "comicEvents", notes = "Fetches lists of events filtered by a comic id.", response = EventDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = EventDataWrapper.class) })
	@GetMapping(value = "/comics/{comicId}/events", produces = "*/*")
	ResponseEntity<EventDataWrapper> comicEvents(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The comic ID.", required = true) @PathVariable("comicId") String comicId,
			@ApiParam(value = "Filter the event list by name.") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only events which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Comic stories", nickname = "comicStories", notes = "Fetches lists of stories filtered by a comic id.", response = StoryDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StoryDataWrapper.class) })
	@GetMapping(value = "/comics/{comicId}/stories", produces = "*/*")
	ResponseEntity<StoryDataWrapper> comicStories(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The comic ID.", required = true) @PathVariable("comicId") String comicId,
			@ApiParam(value = "Return only stories which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Creator by Id", nickname = "creatorById", notes = "Fetches a single creator by id.", response = CreatorDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CreatorDataWrapper.class) })
	@GetMapping(value = "/creators/{creatorId}", produces = "*/*")
	ResponseEntity<CreatorDataWrapper> creatorById(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "A single creator id.", required = true) @PathVariable("creatorId") String creatorId);

	@ApiOperation(value = "Creator comics", nickname = "creatorComics", notes = "Fetches lists of comics filtered by a creator id.", response = ComicDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ComicDataWrapper.class) })
	@GetMapping(value = "/creators/{creatorId}/comics", produces = "*/*")
	ResponseEntity<ComicDataWrapper> creatorComics(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") String creatorId,
			@ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).") @Valid @RequestParam(value = "format", required = false) String format,
			@ApiParam(value = "Filter by the issue format type (comic or collection).") @Valid @RequestParam(value = "formatType", required = false) String formatType,
			@ApiParam(value = "Exclude variant comics from the result set.") @Valid @RequestParam(value = "noVariants", required = false) Boolean noVariants,
			@ApiParam(value = "Return comics within a predefined date range.") @Valid @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
			@ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @Valid @RequestParam(value = "dateRange", required = false) BigDecimal dateRange,
			@ApiParam(value = "Filter by diamond code.") @Valid @RequestParam(value = "diamondCode", required = false) String diamondCode,
			@ApiParam(value = "Filter by digital comic id.") @Valid @RequestParam(value = "digitalId", required = false) BigDecimal digitalId,
			@ApiParam(value = "Filter by UPC.") @Valid @RequestParam(value = "upc", required = false) String upc,
			@ApiParam(value = "Filter by ISBN.") @Valid @RequestParam(value = "isbn", required = false) String isbn,
			@ApiParam(value = "Filter by EAN.") @Valid @RequestParam(value = "ean", required = false) String ean,
			@ApiParam(value = "Filter by ISSN.") @Valid @RequestParam(value = "issn", required = false) String issn,
			@ApiParam(value = "Include only results which are available digitally.") @Valid @RequestParam(value = "hasDigitalIssue", required = false) Boolean hasDigitalIssue,
			@ApiParam(value = "Return only comics which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @Valid @RequestParam(value = "sharedAppearances", required = false) BigDecimal sharedAppearances,
			@ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @Valid @RequestParam(value = "collaborators", required = false) BigDecimal collaborators,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Creator events", nickname = "creatorEvents", notes = "Fetches lists of events filtered by a creator id.", response = EventDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = EventDataWrapper.class) })
	@GetMapping(value = "/creators/{creatorId}/events", produces = "*/*")
	ResponseEntity<EventDataWrapper> creatorEvents(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") String creatorId,
			@ApiParam(value = "Filter the event list by name.") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only events which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Creator series", nickname = "creatorSeries", notes = "Fetches lists of series filtered by a creator id.", response = SeriesDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = SeriesDataWrapper.class) })
	@GetMapping(value = "/creators/{creatorId}/series", produces = "*/*")
	ResponseEntity<SeriesDataWrapper> creatorSeries(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") String creatorId,
			@ApiParam(value = "Filter by series title.") @Valid @RequestParam(value = "title", required = false) String title,
			@ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
			@ApiParam(value = "Return only series matching the specified start year.") @Valid @RequestParam(value = "startYear", required = false) BigDecimal startYear,
			@ApiParam(value = "Return only series which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only series which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only series which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Filter the series by publication frequency type.") @Valid @RequestParam(value = "seriesType", required = false) String seriesType,
			@ApiParam(value = "Return only series containing one or more comics with the specified format.") @Valid @RequestParam(value = "contains", required = false) String contains,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Creator stories", nickname = "creatorStories", notes = "Fetches lists of stories filtered by a creator id.", response = StoryDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StoryDataWrapper.class) })
	@GetMapping(value = "/creators/{creatorId}/stories", produces = "*/*")
	ResponseEntity<StoryDataWrapper> creatorStories(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The ID of the creator.", required = true) @PathVariable("creatorId") String creatorId,
			@ApiParam(value = "Return only stories which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only stories contained in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Event by Id", nickname = "eventById", notes = "Fetches a single event by id.", response = EventDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = EventDataWrapper.class) })
	@GetMapping(value = "/events/{eventId}", produces = "*/*")
	ResponseEntity<EventDataWrapper> eventById(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "A single event.", required = true) @PathVariable("eventId") String eventId);

	@ApiOperation(value = "Event characters", nickname = "eventCharacters", notes = "Fetches lists of characters filtered by an event id.", response = CharacterDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CharacterDataWrapper.class) })
	@GetMapping(value = "/events/{eventId}/characters", produces = "*/*")
	ResponseEntity<CharacterDataWrapper> eventCharacters(
			@RequestParam String ts,
			@RequestParam String apikey,			
			@RequestParam String hash,
			@ApiParam(value = "The event ID", required = true) @PathVariable("eventId") String eventId,
			@ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only characters which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Event comics", nickname = "eventComics", notes = "Fetches lists of comics filtered by an event id.", response = ComicDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ComicDataWrapper.class) })
	@GetMapping(value = "/events/{eventId}/comics", produces = "*/*")
	ResponseEntity<ComicDataWrapper> eventComics(
			@RequestParam String ts,
			@RequestParam String apikey,			
			@RequestParam String hash,
			@ApiParam(value = "The event id.", required = true) @PathVariable("eventId") String eventId,
			@ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).") @Valid @RequestParam(value = "format", required = false) String format,
			@ApiParam(value = "Filter by the issue format type (comic or collection).") @Valid @RequestParam(value = "formatType", required = false) String formatType,
			@ApiParam(value = "Exclude variant comics from the result set.") @Valid @RequestParam(value = "noVariants", required = false) Boolean noVariants,
			@ApiParam(value = "Return comics within a predefined date range.") @Valid @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
			@ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @Valid @RequestParam(value = "dateRange", required = false) BigDecimal dateRange,
			@ApiParam(value = "Filter by diamond code.") @Valid @RequestParam(value = "diamondCode", required = false) String diamondCode,
			@ApiParam(value = "Filter by digital comic id.") @Valid @RequestParam(value = "digitalId", required = false) BigDecimal digitalId,
			@ApiParam(value = "Filter by UPC.") @Valid @RequestParam(value = "upc", required = false) String upc,
			@ApiParam(value = "Filter by ISBN.") @Valid @RequestParam(value = "isbn", required = false) String isbn,
			@ApiParam(value = "Filter by EAN.") @Valid @RequestParam(value = "ean", required = false) String ean,
			@ApiParam(value = "Filter by ISSN.") @Valid @RequestParam(value = "issn", required = false) String issn,
			@ApiParam(value = "Include only results which are available digitally.") @Valid @RequestParam(value = "hasDigitalIssue", required = false) Boolean hasDigitalIssue,
			@ApiParam(value = "Return only comics which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @Valid @RequestParam(value = "sharedAppearances", required = false) BigDecimal sharedAppearances,
			@ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @Valid @RequestParam(value = "collaborators", required = false) BigDecimal collaborators,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Event creators", nickname = "eventCreators", notes = "Fetches lists of creators filtered by an event id.", response = CreatorDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CreatorDataWrapper.class) })
	@GetMapping(value = "/events/{eventId}/creators", produces = "*/*")
	ResponseEntity<CreatorDataWrapper> eventCreators(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The event ID.", required = true) @PathVariable("eventId") String eventId,
			@ApiParam(value = "Filter by creator first name (e.g. brian).") @Valid @RequestParam(value = "firstName", required = false) String firstName,
			@ApiParam(value = "Filter by creator middle name (e.g. Michael).") @Valid @RequestParam(value = "middleName", required = false) String middleName,
			@ApiParam(value = "Filter by creator last name (e.g. Bendis).") @Valid @RequestParam(value = "lastName", required = false) String lastName,
			@ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @Valid @RequestParam(value = "suffix", required = false) String suffix,
			@ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
			@ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @Valid @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
			@ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @Valid @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
			@ApiParam(value = "Return only creators which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only creators who worked on the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only creators who worked on the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Event series", nickname = "eventSeries", notes = "Fetches lists of series filtered by an event id.", response = SeriesDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = SeriesDataWrapper.class) })
	@GetMapping(value = "/events/{eventId}/series", produces = "*/*")
	ResponseEntity<SeriesDataWrapper> eventSeries(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The event ID.", required = true) @PathVariable("eventId") String eventId,
			@ApiParam(value = "Filter by series title.") @Valid @RequestParam(value = "title", required = false) String title,
			@ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
			@ApiParam(value = "Return only series matching the specified start year.") @Valid @RequestParam(value = "startYear", required = false) BigDecimal startYear,
			@ApiParam(value = "Return only series which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only series which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only series which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only series which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Filter the series by publication frequency type.") @Valid @RequestParam(value = "seriesType", required = false) String seriesType,
			@ApiParam(value = "Return only series containing one or more comics with the specified format.") @Valid @RequestParam(value = "contains", required = false) String contains,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Event stories", nickname = "eventStories", notes = "Fetches lists of stories filtered by an event id.", response = StoryDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StoryDataWrapper.class) })
	@GetMapping(value = "/events/{eventId}/stories", produces = "*/*")
	ResponseEntity<StoryDataWrapper> eventStories(
			@RequestParam String ts,
			@RequestParam String apikey,			
			@RequestParam String hash,
			@ApiParam(value = "The ID of the event.", required = true) @PathVariable("eventId") String eventId,
			@ApiParam(value = "Return only stories which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "List characters", nickname = "listCharacters", notes = "Fetches lists of characters.", response = InlineResponse200.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = InlineResponse200.class) })
	@GetMapping(value = "/characters", produces = "*/*")
	ResponseEntity<InlineResponse200> listCharacters(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only characters which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only characters which appear in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "List comics", nickname = "listComics", notes = "Fetches lists of comics.", response = ComicDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ComicDataWrapper.class) })
	@GetMapping(value = "/comics", produces = "*/*")
	ResponseEntity<ComicDataWrapper> listComics(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).") @Valid @RequestParam(value = "format", required = false) String format,
			@ApiParam(value = "Filter by the issue format type (comic or collection).") @Valid @RequestParam(value = "formatType", required = false) String formatType,
			@ApiParam(value = "Exclude variants (alternate covers, secondary printings, director's cuts, etc.) from the result set.") @Valid @RequestParam(value = "noVariants", required = false) Boolean noVariants,
			@ApiParam(value = "Return comics within a predefined date range.") @Valid @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
			@ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @Valid @RequestParam(value = "dateRange", required = false) BigDecimal dateRange,
			@ApiParam(value = "Filter by diamond code.") @Valid @RequestParam(value = "diamondCode", required = false) String diamondCode,
			@ApiParam(value = "Filter by digital comic id.") @Valid @RequestParam(value = "digitalId", required = false) BigDecimal digitalId,
			@ApiParam(value = "Filter by UPC.") @Valid @RequestParam(value = "upc", required = false) String upc,
			@ApiParam(value = "Filter by ISBN.") @Valid @RequestParam(value = "isbn", required = false) String isbn,
			@ApiParam(value = "Filter by EAN.") @Valid @RequestParam(value = "ean", required = false) String ean,
			@ApiParam(value = "Filter by ISSN.") @Valid @RequestParam(value = "issn", required = false) String issn,
			@ApiParam(value = "Include only results which are available digitally.") @Valid @RequestParam(value = "hasDigitalIssue", required = false) Boolean hasDigitalIssue,
			@ApiParam(value = "Return only comics which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids.") @Valid @RequestParam(value = "sharedAppearances", required = false) BigDecimal sharedAppearances,
			@ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids.") @Valid @RequestParam(value = "collaborators", required = false) BigDecimal collaborators,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "List creators", nickname = "listCreators", notes = "Fetches lists of creators.", response = CreatorDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CreatorDataWrapper.class) })
	@GetMapping(value = "/creators", produces = "*/*")
	ResponseEntity<CreatorDataWrapper> listCreators(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "Filter by creator first name (e.g. Brian).") @Valid @RequestParam(value = "firstName", required = false) String firstName,
			@ApiParam(value = "Filter by creator middle name (e.g. Michael).") @Valid @RequestParam(value = "middleName", required = false) String middleName,
			@ApiParam(value = "Filter by creator last name (e.g. Bendis).") @Valid @RequestParam(value = "lastName", required = false) String lastName,
			@ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @Valid @RequestParam(value = "suffix", required = false) String suffix,
			@ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
			@ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @Valid @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
			@ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @Valid @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
			@ApiParam(value = "Return only creators which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only creators who worked on the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only creators who worked on the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "List events", nickname = "listEvents", notes = "Fetches lists of events.", response = EventDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = EventDataWrapper.class) })
	@GetMapping(value = "/events", produces = "*/*")
	ResponseEntity<EventDataWrapper> listEvents(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "Return only events which match the specified name.") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only events which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only events which take place in the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "List series", nickname = "listSeries", notes = "Fetches lists of series.", response = SeriesDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = SeriesDataWrapper.class) })
	@GetMapping(value = "/series", produces = "*/*")
	ResponseEntity<SeriesDataWrapper> listSeries(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "Return only series matching the specified title.") @Valid @RequestParam(value = "title", required = false) String title,
			@ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
			@ApiParam(value = "Return only series matching the specified start year.") @Valid @RequestParam(value = "startYear", required = false) BigDecimal startYear,
			@ApiParam(value = "Return only series which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only series which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only series which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only series which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Filter the series by publication frequency type.") @Valid @RequestParam(value = "seriesType", required = false) String seriesType,
			@ApiParam(value = "Return only series containing one or more comics with the specified format.") @Valid @RequestParam(value = "contains", required = false) String contains,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "List stories", nickname = "listStories", notes = "Fetches lists of stories.", response = StoryDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StoryDataWrapper.class) })
	@GetMapping(value = "/stories", produces = "*/*")
	ResponseEntity<StoryDataWrapper> listStories(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "Return only stories which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Series by id", nickname = "seriesById", notes = "Fetches a single comic series by id.", response = SeriesDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = SeriesDataWrapper.class) })
	@GetMapping(value = "/series/{seriesId}", produces = "*/*")
	ResponseEntity<SeriesDataWrapper> seriesById(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "Filter by series title.", required = true) @PathVariable("seriesId") String seriesId);

	@ApiOperation(value = "Series characters", nickname = "seriesCharacters", notes = "Fetches lists of characters filtered by a series id.", response = CharacterDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CharacterDataWrapper.class) })
	@GetMapping(value = "/series/{seriesId}/characters", produces = "*/*")
	ResponseEntity<CharacterDataWrapper> seriesCharacters(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The series id.", required = true) @PathVariable("seriesId") String seriesId,
			@ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only characters which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Series comics", nickname = "seriesComics", notes = "Fetches lists of comics filtered by a series id.", response = ComicDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ComicDataWrapper.class) })
	@GetMapping(value = "/series/{seriesId}/comics", produces = "*/*")
	ResponseEntity<ComicDataWrapper> seriesComics(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") String seriesId,
			@ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).") @Valid @RequestParam(value = "format", required = false) String format,
			@ApiParam(value = "Filter by the issue format type (comic or collection).") @Valid @RequestParam(value = "formatType", required = false) String formatType,
			@ApiParam(value = "Exclude variant comics from the result set.") @Valid @RequestParam(value = "noVariants", required = false) Boolean noVariants,
			@ApiParam(value = "Return comics within a predefined date range.") @Valid @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
			@ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @Valid @RequestParam(value = "dateRange", required = false) BigDecimal dateRange,
			@ApiParam(value = "Filter by diamond code.") @Valid @RequestParam(value = "diamondCode", required = false) String diamondCode,
			@ApiParam(value = "Filter by digital comic id.") @Valid @RequestParam(value = "digitalId", required = false) BigDecimal digitalId,
			@ApiParam(value = "Filter by UPC.") @Valid @RequestParam(value = "upc", required = false) String upc,
			@ApiParam(value = "Filter by ISBN.") @Valid @RequestParam(value = "isbn", required = false) String isbn,
			@ApiParam(value = "Filter by EAN.") @Valid @RequestParam(value = "ean", required = false) String ean,
			@ApiParam(value = "Filter by ISSN.") @Valid @RequestParam(value = "issn", required = false) String issn,
			@ApiParam(value = "Include only results which are available digitally.") @Valid @RequestParam(value = "hasDigitalIssue", required = false) Boolean hasDigitalIssue,
			@ApiParam(value = "Return only comics which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @Valid @RequestParam(value = "sharedAppearances", required = false) BigDecimal sharedAppearances,
			@ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @Valid @RequestParam(value = "collaborators", required = false) BigDecimal collaborators,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Series creators", nickname = "seriesCreators", notes = "Fetches lists of creators filtered by a series id.", response = CreatorDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CreatorDataWrapper.class) })
	@GetMapping(value = "/series/{seriesId}/creators", produces = "*/*")
	ResponseEntity<CreatorDataWrapper> seriesCreators(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") String seriesId,
			@ApiParam(value = "Filter by creator first name (e.g. brian).") @Valid @RequestParam(value = "firstName", required = false) String firstName,
			@ApiParam(value = "Filter by creator middle name (e.g. Michael).") @Valid @RequestParam(value = "middleName", required = false) String middleName,
			@ApiParam(value = "Filter by creator last name (e.g. Bendis).") @Valid @RequestParam(value = "lastName", required = false) String lastName,
			@ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @Valid @RequestParam(value = "suffix", required = false) String suffix,
			@ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
			@ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @Valid @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
			@ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @Valid @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
			@ApiParam(value = "Return only creators which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only creators who worked on the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Series events", nickname = "seriesEvents", notes = "Fetches lists of events filtered by a series id.", response = EventDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = EventDataWrapper.class) })
	@GetMapping(value = "/series/{seriesId}/events", produces = "*/*")
	ResponseEntity<EventDataWrapper> seriesEvents(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") String seriesId,
			@ApiParam(value = "Filter the event list by name.") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only events which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "stories", required = false) BigDecimal stories,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Series stories", nickname = "seriesStories", notes = "Fetches lists of stories filtered by a series id.", response = StoryDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StoryDataWrapper.class) })
	@GetMapping(value = "/series/{seriesId}/stories", produces = "*/*")
	ResponseEntity<StoryDataWrapper> seriesStories(
			@RequestParam String ts,
			@RequestParam String apikey,			
			@RequestParam String hash,
			@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") String seriesId,
			@ApiParam(value = "Return only stories which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Story by Id", nickname = "storyById", notes = "Fetches a single comic story by id.", response = StoryDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StoryDataWrapper.class) })
	@GetMapping(value = "/stories/{storyId}", produces = "*/*")
	ResponseEntity<StoryDataWrapper> storyById(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "Filter by story id.", required = true) @PathVariable("storyId") String storyId);

	@ApiOperation(value = "Story characters", nickname = "storyCharacters", notes = "Fetches lists of characters filtered by a story id.", response = CharacterDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CharacterDataWrapper.class) })
	@GetMapping(value = "/stories/{storyId}/characters", produces = "*/*")
	ResponseEntity<CharacterDataWrapper> storyCharacters(
			@RequestParam String ts,
			@RequestParam String apikey,			
			@RequestParam String hash,
			@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") String storyId,
			@ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only characters which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Story comics", nickname = "storyComics", notes = "Fetches lists of comics filtered by a story id.", response = ComicDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ComicDataWrapper.class) })
	@GetMapping(value = "/stories/{storyId}/comics", produces = "*/*")
	ResponseEntity<ComicDataWrapper> storyComics(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") String storyId,
			@ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).") @Valid @RequestParam(value = "format", required = false) String format,
			@ApiParam(value = "Filter by the issue format type (comic or collection).") @Valid @RequestParam(value = "formatType", required = false) String formatType,
			@ApiParam(value = "Exclude variant comics from the result set.") @Valid @RequestParam(value = "noVariants", required = false) Boolean noVariants,
			@ApiParam(value = "Return comics within a predefined date range.") @Valid @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
			@ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @Valid @RequestParam(value = "dateRange", required = false) BigDecimal dateRange,
			@ApiParam(value = "Filter by diamond code.") @Valid @RequestParam(value = "diamondCode", required = false) String diamondCode,
			@ApiParam(value = "Filter by digital comic id.") @Valid @RequestParam(value = "digitalId", required = false) BigDecimal digitalId,
			@ApiParam(value = "Filter by UPC.") @Valid @RequestParam(value = "upc", required = false) String upc,
			@ApiParam(value = "Filter by ISBN.") @Valid @RequestParam(value = "isbn", required = false) String isbn,
			@ApiParam(value = "Filter by EAN.") @Valid @RequestParam(value = "ean", required = false) String ean,
			@ApiParam(value = "Filter by ISSN.") @Valid @RequestParam(value = "issn", required = false) String issn,
			@ApiParam(value = "Include only results which are available digitally.") @Valid @RequestParam(value = "hasDigitalIssue", required = false) Boolean hasDigitalIssue,
			@ApiParam(value = "Return only comics which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @Valid @RequestParam(value = "sharedAppearances", required = false) BigDecimal sharedAppearances,
			@ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @Valid @RequestParam(value = "collaborators", required = false) BigDecimal collaborators,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Story creators", nickname = "storyCreators", notes = "Fetches lists of creators filtered by a story id.", response = CreatorDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = CreatorDataWrapper.class) })
	@GetMapping(value = "/stories/{storyId}/creators", produces = "*/*")
	ResponseEntity<CreatorDataWrapper> storyCreators(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") String storyId,
			@ApiParam(value = "Filter by creator first name (e.g. brian).") @Valid @RequestParam(value = "firstName", required = false) String firstName,
			@ApiParam(value = "Filter by creator middle name (e.g. Michael).") @Valid @RequestParam(value = "middleName", required = false) String middleName,
			@ApiParam(value = "Filter by creator last name (e.g. Bendis).") @Valid @RequestParam(value = "lastName", required = false) String lastName,
			@ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @Valid @RequestParam(value = "suffix", required = false) String suffix,
			@ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @Valid @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
			@ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @Valid @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
			@ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @Valid @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
			@ApiParam(value = "Return only creators which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only creators who worked on the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Story events", nickname = "storyEvents", notes = "Fetches lists of events filtered by a story id.", response = EventDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = EventDataWrapper.class) })
	@GetMapping(value = "/stories/{storyId}/events", produces = "*/*")
	ResponseEntity<EventDataWrapper> storyEvents(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") String storyId,
			@ApiParam(value = "Filter the event list by name.") @Valid @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
			@ApiParam(value = "Return only events which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "series", required = false) BigDecimal series,
			@ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

	@ApiOperation(value = "Story series", nickname = "storySeries", notes = "Fetches lists of series filtered by a story id.", response = SeriesDataWrapper.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = SeriesDataWrapper.class) })
	@GetMapping(value = "/stories/{storyId}/series", produces = "*/*")
	ResponseEntity<SeriesDataWrapper> storySeries(
			@RequestParam String ts,
			@RequestParam String apikey,
			@RequestParam String hash,
			@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") String storyId,
			@ApiParam(value = "Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "events", required = false) BigDecimal events,
			@ApiParam(value = "Filter by series title.") @Valid @RequestParam(value = "title", required = false) String title,
			@ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @Valid @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
			@ApiParam(value = "Return only series matching the specified start year.") @Valid @RequestParam(value = "startYear", required = false) BigDecimal startYear,
			@ApiParam(value = "Return only series which have been modified since the specified date.") @Valid @RequestParam(value = "modifiedSince", required = false) String modifiedSince,
			@ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "comics", required = false) BigDecimal comics,
			@ApiParam(value = "Return only series which feature work by the specified creators (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "creators", required = false) BigDecimal creators,
			@ApiParam(value = "Return only series which feature the specified characters (accepts a comma-separated list of ids).") @Valid @RequestParam(value = "characters", required = false) BigDecimal characters,
			@ApiParam(value = "Filter the series by publication frequency type.") @Valid @RequestParam(value = "seriesType", required = false) String seriesType,
			@ApiParam(value = "Return only series containing one or more comics with the specified format.") @Valid @RequestParam(value = "contains", required = false) String contains,
			@ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @Valid @RequestParam(value = "orderBy", required = false) String orderBy,
			@ApiParam(value = "Limit the result set to the specified number of resources.") @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
			@ApiParam(value = "Skip the specified number of resources in the result set.") @Valid @RequestParam(value = "offset", required = false) BigDecimal offset);

}
