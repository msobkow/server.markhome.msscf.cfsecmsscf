
// Description: Java 11 MssCF Binding for ISOTZone Column TZHourOffset.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindISOTZoneTZHourOffset binds ISOTZone.TZHourOffset
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindISOTZoneTZHourOffset
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindISOTZoneTZHourOffset() {
		super();
	}

	public CFSecMssCFBindISOTZoneTZHourOffset( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOTZone",
			"TZHourOffset" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOTZoneTZHourOffset.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		short tZHourOffset;
		if( genDef instanceof ICFSecISOTZoneObj ) {
			tZHourOffset = ((ICFSecISOTZoneObj)genDef).getRequiredTZHourOffset();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOTZoneObj" );
		}

		return( tZHourOffset );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOTZoneTZHourOffset.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecISOTZoneObj ) {
			short tZHourOffset = ((ICFSecISOTZoneObj)genDef).getRequiredTZHourOffset();
			ret = Short.toString( tZHourOffset );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOTZoneObj" );
		}

		return( ret );
	}

}
